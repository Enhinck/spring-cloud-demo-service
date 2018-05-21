package com.enhinck.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.enhinck.demo.model.dto.DemoDO;

public interface DemoMapper {

	List<DemoDO> findByNameLike(@Param("name") String name);
}
