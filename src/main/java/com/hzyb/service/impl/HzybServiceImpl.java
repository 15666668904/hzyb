package com.hzyb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzyb.dao.HzybDao;
import com.hzyb.model.ShopCommodity;
import com.hzyb.service.HzybService;
@Service
public class HzybServiceImpl implements HzybService{

	@Resource
	private HzybDao HzybDao;

	@Override
	public List<ShopCommodity> findall() {
		return HzybDao.findAll();
	}

}
