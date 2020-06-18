package com.aravinthrajchakkaravarthy.userprofile.config;



import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.aravinthrajchakkaravarthy.userprofile.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaData());
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo metaData() {
		Contact myContact=new Contact("Aravinthraj_C","https://www.linkedin.com/in/aravinthraj-chakkaravarthy-a49404115/","aravinthraj.91@gmail.com");
		ApiInfo apiInfo=new ApiInfo("UserProfileMaintenance",
				"Maintain User Profile",
				"1.0.0",
				"Terms of service",
				myContact, 
				"Apache License Version 2.0", 
				"https://www.apache.org/licenses/LICENSE-2.0", 
				new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
