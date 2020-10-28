package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.EditDetecteionList;

import java.util.List;

public interface ThreatsToDetectRepoInterface {

    List<String> getThreatsToDetect();

    void addThreatsToDetect(String addedThreat);

    void removeThreatsToDetect(String removedThreat);
}
