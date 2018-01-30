package com.hzyb.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzyb.service.HzybService;

@RestController
public class HzybController {
	
	private final static Logger Logger=LoggerFactory.getLogger(HzybController.class);
	
	@Autowired
	private HzybService HzybService;
	
	@RequestMapping("/")
	public Map<String, Object> test(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<>();
		Logger.info(request.getRemoteAddr()+"---访问系统");
		map.put("message", "It's Worked!!");
		return map;
	}
	
	@RequestMapping("/jpa")
	public Map<String, Object> jpa(HttpServletRequest request) {
		Map<String, Object> map=new HashMap<>();
		map.put("date", HzybService.findall());
		return map;
	}
	
}
