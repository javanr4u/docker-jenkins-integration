package com.javanr.docker.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

    static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplication.class);
    public static void main(String[] args) {
        logger.info("Started docker-jenkins-integration from jenkins.....");
        SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
    }

}
