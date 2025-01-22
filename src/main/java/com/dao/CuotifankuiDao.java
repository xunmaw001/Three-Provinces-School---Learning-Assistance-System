package com.dao;

import com.entity.CuotifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CuotifankuiVO;
import com.entity.view.CuotifankuiView;


/**
 * 错题反馈
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface CuotifankuiDao extends BaseMapper<CuotifankuiEntity> {
	
	List<CuotifankuiVO> selectListVO(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
	
	CuotifankuiVO selectVO(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
	
	List<CuotifankuiView> selectListView(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);

	List<CuotifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
	
	CuotifankuiView selectView(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
	

}
