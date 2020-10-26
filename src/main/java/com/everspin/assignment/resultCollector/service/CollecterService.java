package com.everspin.assignment.resultCollector.service;

import com.everspin.assignment.resultCollector.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CollecterService implements CollectorServiceInterface {

    @Override
    public BlockedResponseInfo Block(AppRequestInfo appRequestInfo) {
        return null;
    }

    @Override
    public StatisticResponseInfo ShowStatisticAndroid() {
        return null;
    }

    @Override
    public StatisticResponseInfo ShowStatisticIos() {
        return null;
    }

    @Override
    public DetectionList EditDetectionList(EditDetecteionList editDetecteionList) {
        return null;
    }

    @Override
    public DetectionList showDetectionList(DetectionList detectionList) {
        return null;
    }
}
