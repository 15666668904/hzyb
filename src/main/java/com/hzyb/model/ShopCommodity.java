package com.hzyb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_commodity")
public class ShopCommodity {
	private String commoditySid;
	private String code;
	private String name;
	private String description;
	@Id
	@Column(name="commodity_sid")
	public String getCommoditySid() {
		return commoditySid;
	}
	public void setCommoditySid(String commoditySid) {
		this.commoditySid = commoditySid;
	}
	@Column(name="code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="enter_openid")
	public String getEnterOpenid() {
		return enterOpenid;
	}
	public void setEnterOpenid(String enterOpenid) {
		this.enterOpenid = enterOpenid;
	}
	@Column(name="enter_date")
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	@Column(name="update_openid")
	public String getUpdateOpenid() {
		return updateOpenid;
	}
	public void setUpdateOpenid(String updateOpenid) {
		this.updateOpenid = updateOpenid;
	}
	@Column(name="update_date")
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Column(name="unit_price")
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	private String enterOpenid;
	private Date enterDate;
	private String updateOpenid;
	private Date updateDate;
	private String unitPrice;
}
