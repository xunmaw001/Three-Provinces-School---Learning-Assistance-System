package com.dao;

import com.entity.XuanzezuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuanzezuoyeVO;
import com.entity.view.XuanzezuoyeView;


/**
 * 选择作业
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface XuanzezuoyeDao extends BaseMapper<XuanzezuoyeEntity> {
	
	List<XuanzezuoyeVO> selectListVO(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
	
	XuanzezuoyeVO selectVO(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
	
	List<XuanzezuoyeView> selectListView(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);

	List<XuanzezuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
	
	XuanzezuoyeView selectView(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
	

}
