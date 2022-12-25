package com.protentecs.enc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@ComponentScan(basePackages = {"com/protentecs/enc/validator"})
public class StandaloneEncApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StandaloneEncApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).filter(bean -> !bean.startsWith("org."))
                .forEach(System.out::println);
    }

}
