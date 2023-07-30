package com.example.qltc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Qltc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Qltc2Application.class, args);
	}
	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry
							.addMapping("/**")
							.allowedMethods("GET", "POST", "PUT", "DELETE")
							.allowedHeaders("*")
							.allowedOrigins("*");
				}
			};
		}
	}
}
