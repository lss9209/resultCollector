package com.everspin.assignment.resultCollector.domain;

import java.util.List;

public class DetectionList {

    private List<String> threatListToExclude;

    public List<String> getThreatListToExclude() {
        return threatListToExclude;
    }

    public void setThreatListToExclude(List<String> threatListToExclude) {
        this.threatListToExclude = threatListToExclude;
    }
}
