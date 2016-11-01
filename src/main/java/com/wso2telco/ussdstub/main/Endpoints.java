/*******************************************************************************
 * Copyright (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) 
 * 
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.ussdstub.main;

import com.wso2telco.ussdstub.emulator.MobileHandler;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Arrays;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.json.JSONObject;

@Path(value="v1/")
public class Endpoints {
	private static final Logger LOG = Logger.getLogger(Endpoints.class.getName());

	@POST
	@Path(value="outbound/{senderAddress}")
	@Produces(value={"application/json"})
	public void sendUSSDOneAPI(String jsonBody, @PathParam(value="senderAddress") String senderAddress) throws SQLException, RemoteException, Exception {
		addRequest(jsonBody,senderAddress);
	}
	
	public boolean authenticatorType(String notifyURL){
		String delims = "/";
		String[] tokens = notifyURL.split(delims);
		boolean pinAuthenticator = false;
		pinAuthenticator = Arrays.asList(tokens).contains("pin") || (Arrays.asList(tokens).contains("user-registration") && Arrays.asList(tokens).contains("ussd") && Arrays.asList(tokens).contains("receive") && !Arrays.asList(tokens).contains("push"));
		return pinAuthenticator;
	}
	
	public void addRequest(String jsonBody,String senderAddress){
		JSONObject jsonObj = new JSONObject(jsonBody);
		LOG.info("JSON body Recieved "+jsonBody);
		String notifyURL = jsonObj.getJSONObject("outboundUSSDMessageRequest").getJSONObject("responseRequest").getString("notifyURL");
		boolean pinAuthenticator=authenticatorType(notifyURL);
		String outboundUSSDMessage= jsonObj.getJSONObject("outboundUSSDMessageRequest").getString("outboundUSSDMessage");
		MobileHandler.addRequest(jsonBody, senderAddress,pinAuthenticator,outboundUSSDMessage);
	}
}
	