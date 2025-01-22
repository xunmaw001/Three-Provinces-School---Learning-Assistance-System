package com.dao;

import com.entity.WanchengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengzuoyeVO;
import com.entity.view.WanchengzuoyeView;


/**
 * 完成作业
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface WanchengzuoyeDao extends BaseMapper<WanchengzuoyeEntity> {
	
	List<WanchengzuoyeVO> selectListVO(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
	
	WanchengzuoyeVO selectVO(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
	
	List<WanchengzuoyeView> selectListView(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);

	List<WanchengzuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
	
	WanchengzuoyeView selectView(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
	

}
