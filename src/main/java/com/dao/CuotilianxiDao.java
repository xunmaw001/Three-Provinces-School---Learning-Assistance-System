package com.dao;

import com.entity.CuotilianxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CuotilianxiVO;
import com.entity.view.CuotilianxiView;


/**
 * 错题练习
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface CuotilianxiDao extends BaseMapper<CuotilianxiEntity> {
	
	List<CuotilianxiVO> selectListVO(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
	
	CuotilianxiVO selectVO(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
	
	List<CuotilianxiView> selectListView(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);

	List<CuotilianxiView> selectListView(Pagination page,@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
	
	CuotilianxiView selectView(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
	

}
