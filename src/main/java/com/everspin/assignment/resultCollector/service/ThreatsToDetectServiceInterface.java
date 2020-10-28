package com.everspin.assignment.resultCollector.service;

import com.everspin.assignment.resultCollector.domain.EditDetecteionList;

public interface ThreatsToDetectServiceInterface {

    boolean checkIfUnlistedThreat(EditDetecteionList editDetecteionList);

    boolean checkIfConflictingReq (EditDetecteionList editDetecteionList);

    void addThreatsToDetect(EditDetecteionList editDetecteionList);

    void removeThreatsToDetect(EditDetecteionList editDetecteionList);
}
