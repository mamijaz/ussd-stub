# USSD Stub 
Testing Utility for USSD Requests.

Requests format(JSON).
Path v1/outbound/{senderAddress} --------  senderAddress:MSISDN of the Mobile


{  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"outboundUSSDMessageRequest": {  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"address": "tel:+91##########",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"shortCode": "tel:1721",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"keyword": "3456",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"outboundUSSDMessage": "To register with Mobile Connect?\n1. OK\n2. Cancel",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"clientCorrelator": "91##########",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"responseRequest": {  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"notifyURL": "https://localhost:9443/UserRegistration-1.0-SNAPSHOT/webresources/endpoint/ussd/push/receive",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"callbackData": ""  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;},  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"ussdAction": "mtinit",  
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"deliveryStatus": "SENT"
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     
     }
     
}  
