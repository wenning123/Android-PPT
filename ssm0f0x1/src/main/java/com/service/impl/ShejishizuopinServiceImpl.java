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


import com.dao.ShejishizuopinDao;
import com.entity.ShejishizuopinEntity;
import com.service.ShejishizuopinService;
import com.entity.vo.ShejishizuopinVO;
import com.entity.view.ShejishizuopinView;

@Service("shejishizuopinService")
public class ShejishizuopinServiceImpl extends ServiceImpl<ShejishizuopinDao, ShejishizuopinEntity> implements ShejishizuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShejishizuopinEntity> page = this.selectPage(
                new Query<ShejishizuopinEntity>(params).getPage(),
                new EntityWrapper<ShejishizuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShejishizuopinEntity> wrapper) {
		  Page<ShejishizuopinView> page =new Query<ShejishizuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShejishizuopinVO> selectListVO(Wrapper<ShejishizuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShejishizuopinVO selectVO(Wrapper<ShejishizuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShejishizuopinView> selectListView(Wrapper<ShejishizuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShejishizuopinView selectView(Wrapper<ShejishizuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
