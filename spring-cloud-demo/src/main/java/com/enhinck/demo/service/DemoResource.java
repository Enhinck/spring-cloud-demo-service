package com.enhinck.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.remote.result.CallRemoteResult;
import com.enhinck.demo.mapper.DemoMapper;
import com.enhinck.demo.model.dto.DemoDO;

@RestController
@RequestMapping("/rest/demo")
public class DemoResource {

	@Resource
	private DemoMapper userMapper;

	@PostMapping(value = "/do")
	public CallRemoteResult<String> login(@RequestParam("name") String name) {

		List<DemoDO> demoDos = userMapper.findByNameLike(name);
		String result = null;
		if(CollectionUtils.isNotEmpty(demoDos)) {
			result = demoDos.get(0).getName();
		}
		
		return new CallRemoteResult<String>(result);
	}

}
