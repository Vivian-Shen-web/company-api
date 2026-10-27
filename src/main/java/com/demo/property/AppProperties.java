package com.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 应用级配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    /**
     * 系统类型
     */
    private String systemType;
}
