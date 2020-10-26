package com.everspin.assignment.resultCollector.repository;

import com.everspin.assignment.resultCollector.domain.BlockedResponseInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CollectorRepo implements CollectorRepoInterface {

    private static List<BlockedResponseInfo> androidDetectedLogList = new ArrayList<>();
    private static List<BlockedResponseInfo> iosDetectedLogList = new ArrayList<>();

    @Override
    public void putInAndroidList(BlockedResponseInfo blockedResponseInfo) {

    }

    @Override
    public void putInIosList(BlockedResponseInfo blockedResponseInfo) {

    }
}
