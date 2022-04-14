package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 设计师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
@TableName("shejishi")
public class ShejishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShejishiEntity() {
		
	}
	
	public ShejishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 设计师账号
	 */
					
	private String shejishizhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 设计师姓名
	 */
					
	private String shejishixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 设计师电话
	 */
					
	private String shejishidianhua;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：设计师账号
	 */
	public void setShejishizhanghao(String shejishizhanghao) {
		this.shejishizhanghao = shejishizhanghao;
	}
	/**
	 * 获取：设计师账号
	 */
	public String getShejishizhanghao() {
		return shejishizhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：设计师姓名
	 */
	public void setShejishixingming(String shejishixingming) {
		this.shejishixingming = shejishixingming;
	}
	/**
	 * 获取：设计师姓名
	 */
	public String getShejishixingming() {
		return shejishixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：设计师电话
	 */
	public void setShejishidianhua(String shejishidianhua) {
		this.shejishidianhua = shejishidianhua;
	}
	/**
	 * 获取：设计师电话
	 */
	public String getShejishidianhua() {
		return shejishidianhua;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
