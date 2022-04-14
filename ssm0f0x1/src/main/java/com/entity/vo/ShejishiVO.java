package com.entity.vo;

import com.entity.ShejishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设计师
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public class ShejishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
