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


import com.dao.CuotifankuiDao;
import com.entity.CuotifankuiEntity;
import com.service.CuotifankuiService;
import com.entity.vo.CuotifankuiVO;
import com.entity.view.CuotifankuiView;

@Service("cuotifankuiService")
public class CuotifankuiServiceImpl extends ServiceImpl<CuotifankuiDao, CuotifankuiEntity> implements CuotifankuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CuotifankuiEntity> page = this.selectPage(
                new Query<CuotifankuiEntity>(params).getPage(),
                new EntityWrapper<CuotifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CuotifankuiEntity> wrapper) {
		  Page<CuotifankuiView> page =new Query<CuotifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CuotifankuiVO> selectListVO(Wrapper<CuotifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CuotifankuiVO selectVO(Wrapper<CuotifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CuotifankuiView> selectListView(Wrapper<CuotifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CuotifankuiView selectView(Wrapper<CuotifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
