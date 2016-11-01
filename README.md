# ussd-stub
Testing Utility for USSD Requests.

Requests format.
Path v1/outbound/{senderAddress} --------  senderAddress:MSISDN of the Mobile


{
"outboundUSSDMessageRequest": {
  "address": "tel:+91##########",
  "shortCode": "tel:1721",
  "keyword": "3456",
  "outboundUSSDMessage": "To register with Mobile Connect?\n1. OK\n2. Cancel",
  "clientCorrelator": "91##########",
  "responseRequest": {
    "notifyURL": "https://localhost:9443/UserRegistration-1.0-SNAPSHOT/webresources/endpoint/ussd/push/receive",
    "callbackData": ""
  },
  "ussdAction": "mtinit",
  "deliveryStatus": "SENT"
}
}
