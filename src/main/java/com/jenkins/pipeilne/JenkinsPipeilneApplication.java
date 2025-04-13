package com.jenkins.pipeilne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipeilneApplication {

    public static void main(String[] args) {
		SpringApplication.run(JenkinsPipeilneApplication.class, args);
		System.out.println("Jenkins CI/CD demo...");

        System.out.println("Some changes to trigger jenkins build");

        System.out.println("Some more changes to re-validate the trigger of jenkins build");
    }
}