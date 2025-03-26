package com.ketolive.ketolivediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KetoliveDiscoveryServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(KetoliveDiscoveryServerApplication.class, args);
    }

}
