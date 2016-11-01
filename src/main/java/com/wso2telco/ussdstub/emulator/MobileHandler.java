package com.wso2telco.ussdstub.emulator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.wso2telco.ussdstub.main.OutboundMobileMessage;

public class MobileHandler extends HttpServlet {

    private static final Logger LOG = Logger.getLogger((String)MobileHandler.class.getName());

	private static final long serialVersionUID = 1L;

	private static Queue<JSONObject> requests = new LinkedList<JSONObject>();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out =response.getWriter();
		JSONObject obj=getRequest();
		if(obj==null){
			out.write("null");
		}
		else{
			out.write(obj.toString());
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {		
		String jsonBody = request.getParameter("jsonBody");
		String senderAddress = request.getParameter("senderAddress");
		String userinput = request.getParameter("userinput");
        LOG.info("User Response Recieved "+userinput);
		if(!userinput.equals("userCancel")){
			try {
				(new OutboundMobileMessage()).sendUSSDOneAPI(jsonBody,senderAddress,userinput);		
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//removeRequest();
	}

	public static void addRequest(String jsonBody,String senderAddress,boolean pinAuthenticator,String outboundUSSDMessage){
		JSONObject obj = new JSONObject();
		obj.put("jsonBody", jsonBody);
		obj.put("senderAddress", senderAddress);
		obj.put("pinAuthenticator", pinAuthenticator);
		obj.put("outboundUSSDMessage",outboundUSSDMessage);
		requests.add(obj);
	}

	public static JSONObject getRequest(){
		if(requests.isEmpty()){
			return null;
		}
		else{
			JSONObject obj=requests.remove();
			return obj;
		}
	}

	/*
	public static JSONObject removeRequest(){
		if(requests.isEmpty()){
			return null;
		}
		else{
			JSONObject obj=requests.remove();
			return obj;
		}

	}
	*/

}
