package com.everspin.assignment.resultCollector.domain;

public class BlockedResponseInfo {

    private String result;
    private String[] detectedListByPolicy;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String[] getDetectedListByPolicy() {
        return detectedListByPolicy;
    }

    public void setDetectedListByPolicy(String[] detectedListByPolicy) {
        this.detectedListByPolicy = detectedListByPolicy;
    }
}
