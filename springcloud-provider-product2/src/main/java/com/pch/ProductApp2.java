package com.pch;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.pch.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductApp2 {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp2.class,args);
    }
}