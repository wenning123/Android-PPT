package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShejishizuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShejishizuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShejishizuopinView;


/**
 * 设计师作品
 *
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public interface ShejishizuopinService extends IService<ShejishizuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShejishizuopinVO> selectListVO(Wrapper<ShejishizuopinEntity> wrapper);
   	
   	ShejishizuopinVO selectVO(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
   	
   	List<ShejishizuopinView> selectListView(Wrapper<ShejishizuopinEntity> wrapper);
   	
   	ShejishizuopinView selectView(@Param("ew") Wrapper<ShejishizuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShejishizuopinEntity> wrapper);
   	

}

