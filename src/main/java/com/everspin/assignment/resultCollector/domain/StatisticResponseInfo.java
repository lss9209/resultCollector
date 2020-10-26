package com.everspin.assignment.resultCollector.domain;

public class StatisticResponseInfo {

    private String os;
    private String[] detectedThreats;
    private String[] detectedListByPolicy;
    private String result;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String[] getDetectedThreats() {
        return detectedThreats;
    }

    public void setDetectedThreats(String[] detectedThreats) {
        this.detectedThreats = detectedThreats;
    }

    public String[] getDetectedListByPolicy() {
        return detectedListByPolicy;
    }

    public void setDetectedListByPolicy(String[] detectedListByPolicy) {
        this.detectedListByPolicy = detectedListByPolicy;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
