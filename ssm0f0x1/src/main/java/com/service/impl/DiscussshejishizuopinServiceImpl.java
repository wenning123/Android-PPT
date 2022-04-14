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


import com.dao.DiscussshejishizuopinDao;
import com.entity.DiscussshejishizuopinEntity;
import com.service.DiscussshejishizuopinService;
import com.entity.vo.DiscussshejishizuopinVO;
import com.entity.view.DiscussshejishizuopinView;

@Service("discussshejishizuopinService")
public class DiscussshejishizuopinServiceImpl extends ServiceImpl<DiscussshejishizuopinDao, DiscussshejishizuopinEntity> implements DiscussshejishizuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshejishizuopinEntity> page = this.selectPage(
                new Query<DiscussshejishizuopinEntity>(params).getPage(),
                new EntityWrapper<DiscussshejishizuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshejishizuopinEntity> wrapper) {
		  Page<DiscussshejishizuopinView> page =new Query<DiscussshejishizuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshejishizuopinVO> selectListVO(Wrapper<DiscussshejishizuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshejishizuopinVO selectVO(Wrapper<DiscussshejishizuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshejishizuopinView> selectListView(Wrapper<DiscussshejishizuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshejishizuopinView selectView(Wrapper<DiscussshejishizuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
