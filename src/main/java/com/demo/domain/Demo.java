package com.demo.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("demo")
public class Demo extends BaseEntity {
    /**
     * 名称
     */
    private String name;

    /**
     * 状态: 0=启用, 1=停用
     */
    private String status;

    /**
     * 软删除: 0=正常, 1=已删除
     */
    @TableLogic
    private Integer deleted;

}
