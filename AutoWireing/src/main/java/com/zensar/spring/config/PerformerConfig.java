package com.zensar.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zensar.spring.instruments","com.zensar.spring.performers"})
public class PerformerConfig {

}
