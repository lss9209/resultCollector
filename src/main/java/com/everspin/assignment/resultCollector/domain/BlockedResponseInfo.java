package com.everspin.assignment.resultCollector.domain;

import java.util.List;

public class BlockedResponseInfo {

    private String result;
    private List<String> detectedListByPolicy;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getDetectedListByPolicy() {
        return detectedListByPolicy;
    }

    public void setDetectedListByPolicy(List<String> detectedListByPolicy) {
        this.detectedListByPolicy = detectedListByPolicy;
    }
}
