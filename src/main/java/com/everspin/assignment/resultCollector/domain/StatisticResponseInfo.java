package com.everspin.assignment.resultCollector.domain;

import java.util.List;

public class StatisticResponseInfo {

    private String os;
    private List<String> detectedThreats;
    private List<String> detectedListByPolicy;
    private String result;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getDetectedThreats() {
        return detectedThreats;
    }

    public void setDetectedThreats(List<String> detectedThreats) {
        this.detectedThreats = detectedThreats;
    }

    public List<String> getDetectedListByPolicy() {
        return detectedListByPolicy;
    }

    public void setDetectedListByPolicy(List<String> detectedListByPolicy) {
        this.detectedListByPolicy = detectedListByPolicy;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
