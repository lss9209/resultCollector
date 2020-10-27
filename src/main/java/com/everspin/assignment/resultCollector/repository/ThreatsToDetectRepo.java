package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.AppRequestInfo;
import com.everspin.assignment.resultCollector.domain.EditDetecteionList;
import com.everspin.assignment.resultCollector.exception.ConflictingReqException;
import com.everspin.assignment.resultCollector.exception.UnlistedThreatException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ThreatsToDetectRepo implements ThreatsToDetectRepoInterface {

    @Value("${threat.list}")
    private String[] threatList;

    private static List<String> ThreatsToDetect = new ArrayList<>();

    @Override
    public boolean checkIfUnlistedThreat(EditDetecteionList editDetecteionList) {
        boolean isInsertedOneListed = false;
        boolean isExcludedOneListed = false;
        for(String inserted : editDetecteionList.getIncludeList()) {
            for(String listedOne : ThreatsToDetect) {
                if(inserted.equalsIgnoreCase(listedOne)) {
                    isInsertedOneListed = true;
                    break;
                }
            }
        }
        for(String excluded : editDetecteionList.getExcludeList()) {
            for(String listedOne : ThreatsToDetect) {
                if(excluded.equalsIgnoreCase(listedOne)) {
                    isExcludedOneListed = true;
                    break;
                }
            }
        }
        if(!isInsertedOneListed || !isExcludedOneListed) return true;
        else return false;
    }

    @Override
    public boolean checkIfConflictingReq(EditDetecteionList editDetecteionList) {
        boolean isConflict = false;
        for(String inserted : editDetecteionList.getIncludeList()) {
            for(String excluded : editDetecteionList.getExcludeList()) {
                if(inserted.equalsIgnoreCase(excluded)) {
                    isConflict = true;
                    break;
                }
            }
        }
        if(isConflict) return true;
        return false;
    }

    @Override
    public void addThreatsToDetect(EditDetecteionList editDetecteionList) {
        if(checkIfUnlistedThreat(editDetecteionList)) {
            throw new UnlistedThreatException();
        }
        if(checkIfConflictingReq(editDetecteionList)) {
            throw new ConflictingReqException();
        }
        for(String inserted : editDetecteionList.getIncludeList()) {
            if(ThreatsToDetect.isEmpty()) {ThreatsToDetect.add(inserted);}
            else {
                boolean isNotExist = true;
                for(String checkIfAleardyExist : ThreatsToDetect) {
                    if(inserted.equalsIgnoreCase(checkIfAleardyExist)) {
                        isNotExist = false;
                        break;
                    }
                }
                if(isNotExist) {ThreatsToDetect.add(inserted);}
            }
        }
    }

    @Override
    public void removeThreatsToDetect(EditDetecteionList editDetecteionList) {
        if(checkIfUnlistedThreat(editDetecteionList)) {
            throw new UnlistedThreatException();
        }
        if(checkIfConflictingReq(editDetecteionList)) {
            throw new ConflictingReqException();
        }
        for(int idx = 0; idx < editDetecteionList.getExcludeList().size(); idx++) {
            if(ThreatsToDetect.isEmpty()) return;
            else {
                for(int idx2 = 0; idx2 < ThreatsToDetect.size(); idx2++) {
                    if(editDetecteionList.getExcludeList().get(idx).equalsIgnoreCase(ThreatsToDetect.get(idx2))) {
                        ThreatsToDetect.remove(idx2);
                        break;
                    }
                }
            }
        }
    }
}
