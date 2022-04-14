package com.entity.view;

import com.entity.QuerendingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 确认订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
@TableName("querendingdan")
public class QuerendingdanView  extends QuerendingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuerendingdanView(){
	}
 
 	public QuerendingdanView(QuerendingdanEntity querendingdanEntity){
 	try {
			BeanUtils.copyProperties(this, querendingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
