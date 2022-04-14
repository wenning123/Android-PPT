package com.dao;

import com.entity.ShejishizuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShejishizuopinVO;
import com.entity.view.ShejishizuopinView;


/**
 * 设计师作品
 * 
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public interface ShejishizuopinDao extends BaseMapper<ShejishizuopinEntity> {
	
	List<ShejishizuopinVO> selectListVO(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
	
	ShejishizuopinVO selectVO(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
	
	List<ShejishizuopinView> selectListView(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);

	List<ShejishizuopinView> selectListView(Pagination page,@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
	
	ShejishizuopinView selectView(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
	

}
