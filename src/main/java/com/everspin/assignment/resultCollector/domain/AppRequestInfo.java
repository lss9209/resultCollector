package com.everspin.assignment.resultCollector.domain;

import java.util.Arrays;
import java.util.List;

public class AppRequestInfo {

    private String os;
    private List<String> detectedThreatList;
    private long createdAt;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getDetectedThreatList() {
        return detectedThreatList;
    }

    public void setDetectedThreatList(List<String> detectedThreatList) {
        this.detectedThreatList = detectedThreatList;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "AppRequestInfo{" +
                "os='" + os + '\'' +
                ", detectedThreatList=" + detectedThreatList.toString() +
                ", createdAt=" + createdAt +
                '}';
    }
}
