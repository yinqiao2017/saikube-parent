package com.skb.allocate.service;

import com.skb.allocate.domain.OrderBatch;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/8.
 */

public interface FnAllocateTaskService {
    void addTasks(Map<String,OrderBatch> orderBatches);
}
