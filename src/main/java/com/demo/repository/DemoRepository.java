package com.demo.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.domain.Demo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoRepository extends BaseMapper<Demo> {
}
