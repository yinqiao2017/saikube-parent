package com.skb.allocate.service.impl;

import com.skb.allocate.dao.FnAllocateTaskMapper;
import com.skb.allocate.domain.OrderBatch;
import com.skb.allocate.service.FnAllocateTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/8.
 */
@Service
public class FnAllocateTaskServiceImpl implements FnAllocateTaskService {

    @Autowired
    FnAllocateTaskMapper fnAllocateTaskMapper;

    @Override
    public void addTasks(Map<String, OrderBatch> orderBatches) {

    }
}
