package com.devopsbuddy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.devopsbuddy")
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistence.repositories") //improves startup performance
@EntityScan(basePackages = "com.devopsbuddy.backend.persistence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {

}