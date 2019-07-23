package com.mego.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages="com.mego.*")
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableCircuitBreaker
@EntityScan(basePackages="com.mego.*")
@EnableJpaRepositories(basePackages="com.mego.*")
@EnableTransactionManagement

public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
