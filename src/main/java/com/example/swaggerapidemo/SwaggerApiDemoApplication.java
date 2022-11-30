package com.example.swaggerapidemo;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SwaggerApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApiDemoApplication.class, args);
	}
	  @Bean
	    public Docket swagger() {
	        return new Docket(SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.any())
	            .paths(PathSelectors.any())
	            .build();
	    }
	  @Bean
	    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		  
		  System.out.println("------placeholderConfigurer---------"+ new ClassPathResource("git.properties").getPath());
	        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
	        c.setLocation(new ClassPathResource("git.properties"));
	        c.setIgnoreResourceNotFound(true);
	        c.setIgnoreUnresolvablePlaceholders(true);
	       

	        return c;
	    }
}
