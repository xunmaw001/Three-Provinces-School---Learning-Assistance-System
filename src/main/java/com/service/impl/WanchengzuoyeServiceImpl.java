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


import com.dao.WanchengzuoyeDao;
import com.entity.WanchengzuoyeEntity;
import com.service.WanchengzuoyeService;
import com.entity.vo.WanchengzuoyeVO;
import com.entity.view.WanchengzuoyeView;

@Service("wanchengzuoyeService")
public class WanchengzuoyeServiceImpl extends ServiceImpl<WanchengzuoyeDao, WanchengzuoyeEntity> implements WanchengzuoyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengzuoyeEntity> page = this.selectPage(
                new Query<WanchengzuoyeEntity>(params).getPage(),
                new EntityWrapper<WanchengzuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengzuoyeEntity> wrapper) {
		  Page<WanchengzuoyeView> page =new Query<WanchengzuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanchengzuoyeVO> selectListVO(Wrapper<WanchengzuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengzuoyeVO selectVO(Wrapper<WanchengzuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengzuoyeView> selectListView(Wrapper<WanchengzuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengzuoyeView selectView(Wrapper<WanchengzuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
