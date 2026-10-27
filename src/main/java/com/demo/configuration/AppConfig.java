package com.demo.configuration;

import com.demo.property.FileStorageProperties;
import com.demo.property.HttpPoolProperties;
import com.demo.property.WhiteListProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public WhiteListProperties whiteListProperties() {
        return new WhiteListProperties();
    }

    @Bean
    public HttpPoolProperties httpPoolProperties() {
        return new HttpPoolProperties();
    }

    @Bean
    public FileStorageProperties fileStorageProperties() {
        return new FileStorageProperties();
    }
}
