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


import com.dao.CuotilianxiDao;
import com.entity.CuotilianxiEntity;
import com.service.CuotilianxiService;
import com.entity.vo.CuotilianxiVO;
import com.entity.view.CuotilianxiView;

@Service("cuotilianxiService")
public class CuotilianxiServiceImpl extends ServiceImpl<CuotilianxiDao, CuotilianxiEntity> implements CuotilianxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CuotilianxiEntity> page = this.selectPage(
                new Query<CuotilianxiEntity>(params).getPage(),
                new EntityWrapper<CuotilianxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CuotilianxiEntity> wrapper) {
		  Page<CuotilianxiView> page =new Query<CuotilianxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CuotilianxiVO> selectListVO(Wrapper<CuotilianxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CuotilianxiVO selectVO(Wrapper<CuotilianxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CuotilianxiView> selectListView(Wrapper<CuotilianxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CuotilianxiView selectView(Wrapper<CuotilianxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
