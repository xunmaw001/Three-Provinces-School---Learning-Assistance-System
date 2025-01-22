package com.dao;

import com.entity.DiscusszuoyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuoyexinxiVO;
import com.entity.view.DiscusszuoyexinxiView;


/**
 * 作业信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface DiscusszuoyexinxiDao extends BaseMapper<DiscusszuoyexinxiEntity> {
	
	List<DiscusszuoyexinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
	
	DiscusszuoyexinxiVO selectVO(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
	
	List<DiscusszuoyexinxiView> selectListView(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);

	List<DiscusszuoyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
	
	DiscusszuoyexinxiView selectView(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
	

}
