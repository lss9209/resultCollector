package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.AppRequestInfo;
import com.everspin.assignment.resultCollector.domain.BlockedResponseInfo;

import java.util.ArrayList;
import java.util.List;

public interface CollectorRepoInterface {

    void putInRequestList(AppRequestInfo appRequestInfo); //app요청리스트에 넣기(과제에서는 더미데이터를 넣기 위함)

    void putInAndroidList(BlockedResponseInfo blockedResponseInfo); //안드로이드 탐지리스트에 넣기
    
    void putInIosList(BlockedResponseInfo blockedResponseInfo); //IOS 탐지리스트에 넣기

    List<AppRequestInfo> getRequestList(); //app요청리스트 읽기(여기서는 더미데이터들을 읽기 위함)

    List<BlockedResponseInfo> getAndroidList(); //안드로이드 탐지리스트 목록 읽기

    List<BlockedResponseInfo> getIosList(); //IOS 탐지리스트 목록 읽기
}
