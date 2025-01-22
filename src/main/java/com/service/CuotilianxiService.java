package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CuotilianxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CuotilianxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CuotilianxiView;


/**
 * 错题练习
 *
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface CuotilianxiService extends IService<CuotilianxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CuotilianxiVO> selectListVO(Wrapper<CuotilianxiEntity> wrapper);
   	
   	CuotilianxiVO selectVO(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
   	
   	List<CuotilianxiView> selectListView(Wrapper<CuotilianxiEntity> wrapper);
   	
   	CuotilianxiView selectView(@Param("ew") Wrapper<CuotilianxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CuotilianxiEntity> wrapper);
   	

}

