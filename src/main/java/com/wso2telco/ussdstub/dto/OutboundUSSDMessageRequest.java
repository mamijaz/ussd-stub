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

public class OutboundUSSDMessageRequest {
    private String address = "";
    private String shortCode = "";
    private String keyword = "";
    private String outboundUSSDMessage = "";
    private String clientCorrelator = "";
    private ResponseRequest responseRequest = null;
    private String ussdAction = "";
    private String deliveryStatus = "";

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOutboundUSSDMessage() {
        return this.outboundUSSDMessage;
    }

    public void setOutboundUSSDMessage(String outboundUSSDMessage) {
        this.outboundUSSDMessage = outboundUSSDMessage;
    }

    public String getClientCorrelator() {
        return this.clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public ResponseRequest getResponseRequest() {
        return this.responseRequest;
    }

    public void setResponseRequest(ResponseRequest responseRequest) {
        this.responseRequest = responseRequest;
    }

    public String getUssdAction() {
        return this.ussdAction;
    }

    public void setUssdAction(String ussdAction) {
        this.ussdAction = ussdAction;
    }

    public String getDelivaryStatus() {
        return this.deliveryStatus;
    }

    public void setDelivaryStatus(String status) {
        this.deliveryStatus = status;
    }
}