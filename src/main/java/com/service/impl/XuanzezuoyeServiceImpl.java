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


import com.dao.XuanzezuoyeDao;
import com.entity.XuanzezuoyeEntity;
import com.service.XuanzezuoyeService;
import com.entity.vo.XuanzezuoyeVO;
import com.entity.view.XuanzezuoyeView;

@Service("xuanzezuoyeService")
public class XuanzezuoyeServiceImpl extends ServiceImpl<XuanzezuoyeDao, XuanzezuoyeEntity> implements XuanzezuoyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanzezuoyeEntity> page = this.selectPage(
                new Query<XuanzezuoyeEntity>(params).getPage(),
                new EntityWrapper<XuanzezuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanzezuoyeEntity> wrapper) {
		  Page<XuanzezuoyeView> page =new Query<XuanzezuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuanzezuoyeVO> selectListVO(Wrapper<XuanzezuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuanzezuoyeVO selectVO(Wrapper<XuanzezuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuanzezuoyeView> selectListView(Wrapper<XuanzezuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanzezuoyeView selectView(Wrapper<XuanzezuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
