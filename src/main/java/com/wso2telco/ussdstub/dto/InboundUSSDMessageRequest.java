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
package com.wso2telco.ussdstub.dto;

import com.wso2telco.ussdstub.dto.ResponseRequest;
import com.wso2telco.ussdstub.dto.USSDAction;

public class InboundUSSDMessageRequest {
    private String address;
    private String sessionID;
    private String shortCode;
    private String keyword;
    private String inboundUSSDMessage;
    private String clientCorrelator;
    private ResponseRequest responseRequest;
    private USSDAction ussdAction;

    public String getAddress() {
        return this.address;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public String getInboundUSSDMessage() {
        return this.inboundUSSDMessage;
    }

    public String getClientCorrelator() {
        return this.clientCorrelator;
    }

    public ResponseRequest getResponseRequest() {
        return this.responseRequest;
    }

    public USSDAction getUssdAction() {
        return this.ussdAction;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setUssdAction(USSDAction ussdAction) {
        this.ussdAction = ussdAction;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setInboundUSSDMessage(String inboundUSSDMessage) {
        this.inboundUSSDMessage = inboundUSSDMessage;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public void setResponseRequest(ResponseRequest responseRequest) {
        this.responseRequest = responseRequest;
    }
}