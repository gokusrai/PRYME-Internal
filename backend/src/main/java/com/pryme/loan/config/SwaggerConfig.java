package com.pryme.loan.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI prymeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Pryme Loan API")
                        .description("Backend API for Pryme Fintech - Loan Management & Calculators")
                        .version("v1.0"));
    }
}