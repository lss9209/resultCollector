package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.AppRequestInfo;
import com.everspin.assignment.resultCollector.domain.BlockedResponseInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CollectorRepo implements CollectorRepoInterface {

    private static List<AppRequestInfo> requestedAppRequestList = new ArrayList<>();
    private static List<BlockedResponseInfo> androidDetectedLogList = new ArrayList<>();
    private static List<BlockedResponseInfo> iosDetectedLogList = new ArrayList<>();

    @Override
    public void putInRequestList(AppRequestInfo appRequestInfo) {
        requestedAppRequestList.add(appRequestInfo);
    }

    @Override
    public void putInAndroidList(BlockedResponseInfo blockedResponseInfo) {
        androidDetectedLogList.add(blockedResponseInfo);
    }

    @Override
    public void putInIosList(BlockedResponseInfo blockedResponseInfo) {
        iosDetectedLogList.add(blockedResponseInfo);
    }

    @Override
    public List<AppRequestInfo> getRequestList() {
        return requestedAppRequestList;
    }

    @Override
    public List<BlockedResponseInfo> getAndroidList() {
        return androidDetectedLogList;
    }

    @Override
    public List<BlockedResponseInfo> getIosList() {
        return iosDetectedLogList;
    }
}
