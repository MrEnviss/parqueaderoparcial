package com.parqueadero.parcial.Config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI parqueaderoOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Parqueadero")
                        .description("Documentación de servicios web para gestión de parqueadero")
                        .version("1.0"));
    }
}