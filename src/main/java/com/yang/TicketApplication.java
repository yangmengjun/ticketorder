package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author: yangmengjun
 * @date: 2019\3\26 0026 17:21
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.yang"})
public class TicketApplication {

    public static void main(String[] args) {
        Environment env = SpringApplication.run(TicketApplication.class, args).getEnvironment();
        System.out.println("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running!" +
                        "\n----------------------------------------------------------"+
                env.getProperty("spring.application.name"));
    }
}
