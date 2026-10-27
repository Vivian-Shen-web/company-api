package com.demo.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 实体基类 — 统一的系统字段
 */
@Data
public abstract class BaseEntity {
    /**
     * 主键ID（UUID）
     */
    @TableId
    private String id;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 最后修改人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String lastModifiedBy;

    /**
     * 最后修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date lastModifiedDate;
}
