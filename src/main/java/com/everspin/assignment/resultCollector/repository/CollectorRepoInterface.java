package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.BlockedResponseInfo;

public interface CollectorRepoInterface {

    void putInAndroidList(BlockedResponseInfo blockedResponseInfo); //안드로이드 탐지리스트에 넣기
    
    void putInIosList(BlockedResponseInfo blockedResponseInfo); //IOS 탐지리스트에 넣기
}
