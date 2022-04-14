package com.entity.vo;

import com.entity.QuxiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 取消订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public class QuxiaodingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 取消时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date quxiaoshijian;
		
	/**
	 * 取消备注
	 */
	
	private String quxiaobeizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：取消时间
	 */
	 
	public void setQuxiaoshijian(Date quxiaoshijian) {
		this.quxiaoshijian = quxiaoshijian;
	}
	
	/**
	 * 获取：取消时间
	 */
	public Date getQuxiaoshijian() {
		return quxiaoshijian;
	}
				
	
	/**
	 * 设置：取消备注
	 */
	 
	public void setQuxiaobeizhu(String quxiaobeizhu) {
		this.quxiaobeizhu = quxiaobeizhu;
	}
	
	/**
	 * 获取：取消备注
	 */
	public String getQuxiaobeizhu() {
		return quxiaobeizhu;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
