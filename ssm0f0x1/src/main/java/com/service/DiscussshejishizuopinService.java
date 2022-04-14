package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshejishizuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshejishizuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshejishizuopinView;


/**
 * 设计师作品评论表
 *
 * @author 
 * @email 
 * @date 2022-03-13 14:54:19
 */
public interface DiscussshejishizuopinService extends IService<DiscussshejishizuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshejishizuopinVO> selectListVO(Wrapper<DiscussshejishizuopinEntity> wrapper);
   	
   	DiscussshejishizuopinVO selectVO(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
   	
   	List<DiscussshejishizuopinView> selectListView(Wrapper<DiscussshejishizuopinEntity> wrapper);
   	
   	DiscussshejishizuopinView selectView(@Param("ew") Wrapper<DiscussshejishizuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshejishizuopinEntity> wrapper);
   	

}

