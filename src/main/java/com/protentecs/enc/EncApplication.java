package com.protentecs.enc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class EncApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EncApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).filter(bean -> !bean.startsWith("org.")
                        && !bean.contains("spring"))
                .forEach(System.out::println);
    }

}
