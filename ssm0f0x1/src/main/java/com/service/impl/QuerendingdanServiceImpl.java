package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QuerendingdanDao;
import com.entity.QuerendingdanEntity;
import com.service.QuerendingdanService;
import com.entity.vo.QuerendingdanVO;
import com.entity.view.QuerendingdanView;

@Service("querendingdanService")
public class QuerendingdanServiceImpl extends ServiceImpl<QuerendingdanDao, QuerendingdanEntity> implements QuerendingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuerendingdanEntity> page = this.selectPage(
                new Query<QuerendingdanEntity>(params).getPage(),
                new EntityWrapper<QuerendingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuerendingdanEntity> wrapper) {
		  Page<QuerendingdanView> page =new Query<QuerendingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuerendingdanVO> selectListVO(Wrapper<QuerendingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuerendingdanVO selectVO(Wrapper<QuerendingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuerendingdanView> selectListView(Wrapper<QuerendingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuerendingdanView selectView(Wrapper<QuerendingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
