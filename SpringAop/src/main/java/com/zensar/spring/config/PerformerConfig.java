package com.zensar.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.zensar.spring.performers", "com.zensar.spring.aspects" })
@EnableAspectJAutoProxy
public class PerformerConfig {

}
