package com.physical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan(value="com.physical.mapper")
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
public class PhysicalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhysicalApplication.class, args);
    }

}
