package com.everspin.assignment.resultCollector.domain;

public class DetectionList {

    private String[] threatListToExclude;

    public String[] getThreatListToExclude() {
        return threatListToExclude;
    }

    public void setThreatListToExclude(String[] threatListToExclude) {
        this.threatListToExclude = threatListToExclude;
    }
}
