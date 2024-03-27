package com.example.deployexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployExampleApplication {

    @GetMapping("/message")
    public String message(){
        return "Congrats ! you app deployed successfully in Azure !";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeployExampleApplication.class, args);
    }

}
