package com.hzyb.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hzyb.model.ShopCommodity;
@Repository
@Transactional
public interface HzybDao extends JpaRepository<ShopCommodity, String>{

}
