package com.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HTTP连接池配置信息
 */
@ConfigurationProperties(prefix = "http.pool")
@Data
public class HttpPoolProperties {
    /**
     * 连接超时
     */
    private int connectTimeout;

    /**
     * 响应超时
     */
    private int responseTimeout;

    /**
     * 连接池最大连接数
     */
    private int maxTotal = 200;

    /**
     * 每个路由最大连接数
     */
    private int maxPerRoute = 50;
}
