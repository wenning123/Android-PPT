package com.dao;

import com.entity.QuerendingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuerendingdanVO;
import com.entity.view.QuerendingdanView;


/**
 * 确认订单
 * 
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public interface QuerendingdanDao extends BaseMapper<QuerendingdanEntity> {
	
	List<QuerendingdanVO> selectListVO(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
	
	QuerendingdanVO selectVO(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
	
	List<QuerendingdanView> selectListView(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);

	List<QuerendingdanView> selectListView(Pagination page,@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
	
	QuerendingdanView selectView(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
	

}
