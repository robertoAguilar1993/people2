package com.mx.tec.people.people2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String URL = "http://www.aguilar.com.mx/";


    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mx.tec.people.people2"))
                .paths(PathSelectors.ant("/v1/**"))
                .build()
                .groupName("v1")
                .apiInfo(getApiInfo("1"))
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, getCustomizedResponseMessages())
                .globalResponseMessage(RequestMethod.POST, getCustomizedResponseMessages())
                .globalResponseMessage(RequestMethod.PUT, getCustomizedResponseMessages())
                .globalResponseMessage(RequestMethod.DELETE, deleteCustomizedResponseMessages())
                .globalResponseMessage(RequestMethod.PATCH, getCustomizedResponseMessages());

    }

    private ApiInfo getApiInfo(String version){
        return new ApiInfo(
                "API - PEOPLE",
                "API PEOPLE",
                "v".concat(version),
                URL,
                new Contact("Aguilar", URL, "contacto@aguilar.com"),
                "Licencia",
                URL,
                Collections.emptyList()
        );
    }

    private List<ResponseMessage> getCustomizedResponseMessages(){
        List<ResponseMessage> responseMessages = new ArrayList<>();
        responseMessages.add(new ResponseMessageBuilder().code(200).message("Ok").build());
        responseMessages.addAll(customizedResponseMessages());
        return responseMessages;
    }

    private List<ResponseMessage> deleteCustomizedResponseMessages(){
        List<ResponseMessage> responseMessages = new ArrayList<>();
        responseMessages.add(new ResponseMessageBuilder().code(204).message("No Content").build());
        responseMessages.addAll(customizedResponseMessages());
        return responseMessages;
    }

    private List<ResponseMessage> customizedResponseMessages(){
        List<ResponseMessage> responseMessages = new ArrayList<>();
        responseMessages.add(new ResponseMessageBuilder().code(400).message("Input Request is invalid or incorrect").build());
        responseMessages.add(new ResponseMessageBuilder().code(404).message("Not Found. Resource does not exist").build());
        responseMessages.add(new ResponseMessageBuilder().code(409).message("Conflict in the request").build());
        responseMessages.add(new ResponseMessageBuilder().code(500).message("Internal server error, Time out").build());
        return responseMessages;
    }

}