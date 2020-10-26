package com.everspin.assignment.resultCollector.domain;

public class AppRequestInfo {

    private String os;
    private String[] detectedThreatList;
    private long createdAt;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String[] getDetectedThreatList() {
        return detectedThreatList;
    }

    public void setDetectedThreatList(String[] detectedThreatList) {
        this.detectedThreatList = detectedThreatList;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
