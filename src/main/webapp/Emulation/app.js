
var lock = false;
var type;
var jsonBody;
var senderAddress;
var msg;
var response;

backgroundrun();

function backgroundrun(){
    if(!lock){
        setTimeout(getJsonData,1000);
    }
    setTimeout(backgroundrun, 1000);
}

function getJsonData(){
    $.ajax({
        url: 'MobileHandler',
        type: 'GET',
        dataType: 'json',
        success: function(json) {
            if(json!=null){
                lock=true;
                jsonBody=json.jsonBody;
                senderAddress=json.senderAddress;
                type=json.pinAuthenticator;
                msg=json.outboundUSSDMessage;
                $('#content').text(msg);
                setInputType(type);
            }
        }
    });
}

function setInputType(){
    var displayMsg=document.getElementById("display");
    var input = document.getElementById("input");
    var reply = document.getElementById("reply");
    var msgbox=document.getElementById("msgbox");

    if(type==null){
        msgbox.style.display='none' ;
        displayMsg.style.display = 'none' ;
        input.style.display = 'none' ;
        reply.style.display = 'none' ;
    }
    else if(msg.toLowerCase()=="thank you"){
        msgbox.style.display = 'block' ;
        displayMsg.style.display = 'block' ;
        input.style.display = 'none' ;
        reply.style.display = 'block' ;
    }
    else{
        msgbox.style.display = 'block' ;
        displayMsg.style.display = 'block' ;
        input.style.display = 'block' ;
        reply.style.display = 'block' ;
    }
}

function sendOkResponse(){
    response=document.getElementById("pin").value;
    if(response=="#"||msg.toLowerCase()=="thank you"){
        sendCancelResponse();
    }
    else{
        sendResponse();
    }
}

function sendCancelResponse(){
    response="userCancel";
    sendResponse();
}

function sendResponse(){
    $.ajax({
        url:'MobileHandler',
        data:{"jsonBody":jsonBody,"senderAddress":senderAddress,"userinput":response},
        type:'POST',
        complete:function(){
            clear();
        }
    });
}


function clear(){
    document.getElementById("pin").value="";
    lock=false;
    type=null;
    jsonBody=null;
    senderAddress=null;
    msg=null;
}