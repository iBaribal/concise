package com.example.demo.config;

import com.example.demo.resources.MainController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig extends ResourceConfig{

    public AppConfig() {
        register(MainController.class);
    }
}
