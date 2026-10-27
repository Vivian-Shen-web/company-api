package com.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 接口白名单
 */
@Data
@ConfigurationProperties("permission")
public class WhiteListProperties {
    private List<String> whiteList;
}
