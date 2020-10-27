package com.everspin.assignment.resultCollector;

import com.everspin.assignment.resultCollector.domain.AppRequestInfo;
import com.everspin.assignment.resultCollector.repository.CollectorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SettingDummyRunner implements ApplicationRunner {

    @Value("${threat.list}")
    private String[] threatList;

    private CollectorRepo collectorRepo;

    @Autowired
    SettingDummyRunner(CollectorRepo collectorRepo) {
        this.collectorRepo = collectorRepo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //System.out.println(threatList);
        for(int i = 0; i < 120; i++) {
            AppRequestInfo appRequestInfo = new AppRequestInfo();
            if(i % 2 == 0) {
                appRequestInfo.setOs("android");
            } else {
                appRequestInfo.setOs("ios");
            }
            int ranNum = (int)(Math.random() * Math.pow(2, threatList.length));
            List<String> temp = new ArrayList<>();
            int idx = 0;
            while(ranNum > 0) {
                if((ranNum & 1) == 1) temp.add(threatList[idx]);
                idx++;
                ranNum = ranNum >> 1;
            }
            appRequestInfo.setDetectedThreatList(temp);
            appRequestInfo.setCreatedAt(System.currentTimeMillis());
            collectorRepo.putInRequestList(appRequestInfo);
            Thread.sleep(10);
        }
        //System.out.println(collectorRepo.getRequestList().size());
        for(AppRequestInfo e : collectorRepo.getRequestList()) {
            System.out.println(e);
        }
    }
}
