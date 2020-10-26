package com.everspin.assignment.resultCollector.service;

import com.everspin.assignment.resultCollector.domain.*;

public interface CollectorServiceInterface {

    //에러핸들러는 컨트롤러에다가 직접 구현할 것

    BlockedResponseInfo Block(AppRequestInfo appRequestInfo); //app정보가 들어오면 차단여부 탐지.

    StatisticResponseInfo ShowStatisticAndroid(); //안드로이드의 최근 30개 위협정보 보여줌.

    StatisticResponseInfo ShowStatisticIos(); //IOS의 최근 30개 위협정보 보여줌.

    DetectionList EditDetectionList(EditDetecteionList editDetecteionList); //탐지할 위협 추가 및 제거
    
    DetectionList showDetectionList(DetectionList detectionList); //탐지할 위협 리스트 보여주기
}
