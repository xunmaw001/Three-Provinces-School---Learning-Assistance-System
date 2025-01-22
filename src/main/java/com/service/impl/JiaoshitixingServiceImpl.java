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


import com.dao.JiaoshitixingDao;
import com.entity.JiaoshitixingEntity;
import com.service.JiaoshitixingService;
import com.entity.vo.JiaoshitixingVO;
import com.entity.view.JiaoshitixingView;

@Service("jiaoshitixingService")
public class JiaoshitixingServiceImpl extends ServiceImpl<JiaoshitixingDao, JiaoshitixingEntity> implements JiaoshitixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshitixingEntity> page = this.selectPage(
                new Query<JiaoshitixingEntity>(params).getPage(),
                new EntityWrapper<JiaoshitixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshitixingEntity> wrapper) {
		  Page<JiaoshitixingView> page =new Query<JiaoshitixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshitixingVO> selectListVO(Wrapper<JiaoshitixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshitixingVO selectVO(Wrapper<JiaoshitixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshitixingView> selectListView(Wrapper<JiaoshitixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshitixingView selectView(Wrapper<JiaoshitixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
