package com.everspin.assignment.resultCollector.service;

import com.everspin.assignment.resultCollector.domain.EditDetecteionList;
import com.everspin.assignment.resultCollector.exception.ConflictingReqException;
import com.everspin.assignment.resultCollector.exception.UnlistedThreatException;
import com.everspin.assignment.resultCollector.repository.ThreatsToDetectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreatsToDetectService implements ThreatsToDetectServiceInterface {

    private ThreatsToDetectRepo threatsToDetectRepo;

    @Autowired
    public ThreatsToDetectService(ThreatsToDetectRepo threatsToDetectRepo) {
        this.threatsToDetectRepo = threatsToDetectRepo;
    }

    @Value("${threat.list}")
    private String[] threatList;

    @Override
    public boolean checkIfUnlistedThreat(EditDetecteionList editDetecteionList) {
        boolean isInsertedOneListed = false;
        boolean isExcludedOneListed = false;
        for(String inserted : editDetecteionList.getIncludeList()) {
            for(String listedOne : threatsToDetectRepo.getThreatsToDetect()) {
                if(inserted.equalsIgnoreCase(listedOne)) {
                    isInsertedOneListed = true;
                    break;
                }
            }
        }
        for(String excluded : editDetecteionList.getExcludeList()) {
            for(String listedOne : threatsToDetectRepo.getThreatsToDetect()) {
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
        /*if(checkIfUnlistedThreat(editDetecteionList)) {
            throw new UnlistedThreatException();
        }
        if(checkIfConflictingReq(editDetecteionList)) {
            throw new ConflictingReqException();
        }*/
        for(String inserted : editDetecteionList.getIncludeList()) {
            if(threatsToDetectRepo.getThreatsToDetect().isEmpty()) {threatsToDetectRepo.addThreatsToDetect(inserted);}
            else {
                boolean isNotExist = true;
                for(String checkIfAleardyExist : threatsToDetectRepo.getThreatsToDetect()) {
                    if(inserted.equalsIgnoreCase(checkIfAleardyExist)) {
                        isNotExist = false;
                        break;
                    }
                }
                if(isNotExist) {threatsToDetectRepo.addThreatsToDetect(inserted);}
            }
        }
    }

    @Override
    public void removeThreatsToDetect(EditDetecteionList editDetecteionList) {
        /*if(checkIfUnlistedThreat(editDetecteionList)) {
            throw new UnlistedThreatException();
        }
        if(checkIfConflictingReq(editDetecteionList)) {
            throw new ConflictingReqException();
        }*/
        for(String excluded : editDetecteionList.getIncludeList()) {
            if(threatsToDetectRepo.getThreatsToDetect().isEmpty()) return;
            else {
                for(String checkIfExist : threatsToDetectRepo.getThreatsToDetect()) {
                    if(excluded.equalsIgnoreCase(checkIfExist)) {
                        threatsToDetectRepo.removeThreatsToDetect(excluded);
                        break;
                    }
                }
            }
        }

        //아래는 removeThreatsToDetect를 repo에 직접 구현하기 전 코드로 인덱스를 막 찾고 그 인덱스 기준으로 삭제하는 그런 코드라 너무 번잡하다 혹시 몰라 주석으로 남겨둠.
        /*for(int idx = 0; idx < editDetecteionList.getExcludeList().size(); idx++) {
            if(threatsToDetectRepo.getThreatsToDetect().isEmpty()) return;
            else {
                for(int idx2 = 0; idx2 < ThreatsToDetect.size(); idx2++) {
                    if(editDetecteionList.getExcludeList().get(idx).equalsIgnoreCase(ThreatsToDetect.get(idx2))) {
                        ThreatsToDetect.remove(idx2);
                        break;
                    }
                }
            }
        }*/
    }
}
