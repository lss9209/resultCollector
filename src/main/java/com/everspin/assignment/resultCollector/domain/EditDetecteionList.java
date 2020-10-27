package com.everspin.assignment.resultCollector.domain;

import java.util.List;

public class EditDetecteionList {

    private List<String> excludeList;
    private List<String> includeList;

    public List<String> getExcludeList() {
        return excludeList;
    }

    public void setExcludeList(List<String> excludeList) {
        this.excludeList = excludeList;
    }

    public List<String> getIncludeList() {
        return includeList;
    }

    public void setIncludeList(List<String> includeList) {
        this.includeList = includeList;
    }
}
