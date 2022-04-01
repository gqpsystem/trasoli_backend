package com.megafact.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import static springfox.documentation.builders.PathSelectors.regex;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.megafact.controller"))
//                .paths(PathSelectors.regex("/api.*"))
//                .build()
//                .apiInfo(apiInfo());
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select()
                .paths(regex("/api.*")).build();
    }


    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "REST API MEGAFACT",
//                "SISTEMA DE TRAMITE DE SOLICITUD DE LICENCIA",
//                "API V1.1",
//                "http://localhost:9091/swagger-ui.html#/",
//                new Contact("MegaFact", "https://www.facebook.com/megafacturacion/", "gqpsystem@gmail.com"),
//                "Open Source", "\"https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
        return new ApiInfoBuilder().title("REST API MEGAFACT").description("SISTEMA DE TRAMITE DE SOLICITUD DE LICENCIA").version("1.0").build();
    }
}
