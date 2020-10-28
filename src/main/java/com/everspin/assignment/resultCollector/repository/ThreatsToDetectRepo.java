package com.everspin.assignment.resultCollector.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ThreatsToDetectRepo implements ThreatsToDetectRepoInterface {

    private static List<String> threatsToDetect = new ArrayList<>();

    @Override
    public List<String> getThreatsToDetect() {
        return threatsToDetect;
    }

    @Override
    public void addThreatsToDetect(String addedThreat) {
        threatsToDetect.add(addedThreat);
    }

    @Override
    public void removeThreatsToDetect(String removedThreat) {
        for(int idx = 0; idx < threatsToDetect.size(); idx++) {
            if(removedThreat.equalsIgnoreCase(threatsToDetect.get(idx))) {
                threatsToDetect.remove(idx);
                break;
            }
        }
    }
}
