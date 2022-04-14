package com.dao;

import com.entity.DiscussshejishizuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshejishizuopinVO;
import com.entity.view.DiscussshejishizuopinView;


/**
 * 设计师作品评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-13 14:54:19
 */
public interface DiscussshejishizuopinDao extends BaseMapper<DiscussshejishizuopinEntity> {
	
	List<DiscussshejishizuopinVO> selectListVO(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
	
	DiscussshejishizuopinVO selectVO(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
	
	List<DiscussshejishizuopinView> selectListView(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);

	List<DiscussshejishizuopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
	
	DiscussshejishizuopinView selectView(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
	

}
