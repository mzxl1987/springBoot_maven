package com.mego.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {

	@Bean
	public Docket createRestAPI(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.mego.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo getApiInfo(){
		
		return new ApiInfo(
				"Spring Cloud Web 测试系统",
				"SpringBoot系统集成的测试",
				"V20190725",
				"http://localhost:8080",
				"NanJing Mego",
				"Lisense GNU",
				"http://www.baidu.com"
				);
		
	}
}
