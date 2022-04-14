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
 * 设计师作品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
@TableName("shejishizuopin")
public class ShejishizuopinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShejishizuopinEntity() {
		
	}
	
	public ShejishizuopinEntity(T t) {
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
	 * 作品编号
	 */
					
	private String zuopinbianhao;
	
	/**
	 * 作品名称
	 */
					
	private String zuopinmingcheng;
	
	/**
	 * 作品分类
	 */
					
	private String zuopinfenlei;
	
	/**
	 * 设计师账号
	 */
					
	private String shejishizhanghao;
	
	/**
	 * 设计师姓名
	 */
					
	private String shejishixingming;
	
	/**
	 * 设计师电话
	 */
					
	private String shejishidianhua;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 价格
	 */
					
	private String jiage;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：作品编号
	 */
	public void setZuopinbianhao(String zuopinbianhao) {
		this.zuopinbianhao = zuopinbianhao;
	}
	/**
	 * 获取：作品编号
	 */
	public String getZuopinbianhao() {
		return zuopinbianhao;
	}
	/**
	 * 设置：作品名称
	 */
	public void setZuopinmingcheng(String zuopinmingcheng) {
		this.zuopinmingcheng = zuopinmingcheng;
	}
	/**
	 * 获取：作品名称
	 */
	public String getZuopinmingcheng() {
		return zuopinmingcheng;
	}
	/**
	 * 设置：作品分类
	 */
	public void setZuopinfenlei(String zuopinfenlei) {
		this.zuopinfenlei = zuopinfenlei;
	}
	/**
	 * 获取：作品分类
	 */
	public String getZuopinfenlei() {
		return zuopinfenlei;
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
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
