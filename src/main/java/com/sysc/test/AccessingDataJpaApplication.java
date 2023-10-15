package com.sysc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

//    @Bean
//    public CommandLineRunner demo(BuddyInfoRepo repository) {
//        return (args) -> {
//
//            repository.save(new BuddyInfo("X", "1234"));
//            repository.save(new BuddyInfo("Y", "987654"));
//            for (BuddyInfo buddyInfo : repository.findAll()) {
//                log.info(buddyInfo.getName());
//            }
//            log.info("");
//        };
//    }

}