package br.com.projeto.cliente.docs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDoc(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("br.com.projeto.cliente.controllers"))
                    .paths(regex("/.*"))
                    .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Documentation by Tamires ALves")
                .description("projeto")
                .version("1.0")
                .contact(new Contact("Tamires Alves", "", "tamiresalvescontatos@gmail.com"))
                .build();

    }
}
