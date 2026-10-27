package com.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 文件存储配置
 */
@Data
@ConfigurationProperties("file-storage")
public class FileStorageProperties {
    /**
     * 允许上传的文件类型（逗号分隔的后缀名）
     */
    private String allowedTypes = "pdf,doc,docx,xls,xlsx,ppt,pptx,jpg,jpeg,png,gif,txt,md,csv";

    /**
     * 单次上传最大文件数量
     */
    private int maxFileCount = 10;

    /**
     * 单个文件最大大小（MB）
     */
    private int maxFileSizeMb = 20;

    /**
     * 获取允许的文件类型列表
     */
    public List<String> getAllowedTypeList() {
        if (allowedTypes == null || allowedTypes.trim().isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.asList(allowedTypes.toLowerCase().split(","));
    }

    /**
     * 获取最大文件大小（字节）
     */
    public long getMaxFileSizeBytes() {
        return (long) maxFileSizeMb * 1024 * 1024;
    }
}
