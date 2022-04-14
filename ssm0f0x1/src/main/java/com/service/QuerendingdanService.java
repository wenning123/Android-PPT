package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuerendingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuerendingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuerendingdanView;


/**
 * 确认订单
 *
 * @author 
 * @email 
 * @date 2022-03-13 14:54:18
 */
public interface QuerendingdanService extends IService<QuerendingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuerendingdanVO> selectListVO(Wrapper<QuerendingdanEntity> wrapper);
   	
   	QuerendingdanVO selectVO(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
   	
   	List<QuerendingdanView> selectListView(Wrapper<QuerendingdanEntity> wrapper);
   	
   	QuerendingdanView selectView(@Param("ew") Wrapper<QuerendingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuerendingdanEntity> wrapper);
   	

}

