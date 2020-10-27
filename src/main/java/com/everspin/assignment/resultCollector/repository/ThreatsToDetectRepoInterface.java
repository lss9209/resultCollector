package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.EditDetecteionList;

public interface ThreatsToDetectRepoInterface {

    boolean checkIfUnlistedThreat(EditDetecteionList editDetecteionList);

    boolean checkIfConflictingReq (EditDetecteionList editDetecteionList);

    void addThreatsToDetect(EditDetecteionList editDetecteionList);

    void removeThreatsToDetect(EditDetecteionList editDetecteionList);
}
