package com.skb.allocate.controller;

import com.skb.allocate.domain.OrderBatch;
import com.skb.allocate.service.FnAllocateTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/8.
 */
@RestController
@RequestMapping("/fnAllocateTask")
public class FnAllocateTaskController {

    @Autowired
    FnAllocateTaskService fnAllocateTaskService;

    public void addAllocateTask(@RequestBody Map<String,OrderBatch> orderBatchs){
        fnAllocateTaskService.addTasks(orderBatchs);
    }

}
