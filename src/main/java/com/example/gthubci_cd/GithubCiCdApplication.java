package com.example.gthubci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiCdApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to java";
    }


    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdApplication.class, args);
    }

}
