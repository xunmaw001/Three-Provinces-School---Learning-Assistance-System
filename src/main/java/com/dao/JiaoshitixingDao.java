package com.dao;

import com.entity.JiaoshitixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshitixingVO;
import com.entity.view.JiaoshitixingView;


/**
 * 教师提醒
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface JiaoshitixingDao extends BaseMapper<JiaoshitixingEntity> {
	
	List<JiaoshitixingVO> selectListVO(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
	
	JiaoshitixingVO selectVO(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
	
	List<JiaoshitixingView> selectListView(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);

	List<JiaoshitixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
	
	JiaoshitixingView selectView(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
	

}
