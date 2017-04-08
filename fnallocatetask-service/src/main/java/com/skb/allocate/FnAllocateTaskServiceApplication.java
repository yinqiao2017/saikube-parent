package com.skb.allocate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/4/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FnAllocateTaskServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(FnAllocateTaskServiceApplication.class,args);
    }
}

