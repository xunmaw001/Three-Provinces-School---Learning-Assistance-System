package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuanzezuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuanzezuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanzezuoyeView;


/**
 * 选择作业
 *
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface XuanzezuoyeService extends IService<XuanzezuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanzezuoyeVO> selectListVO(Wrapper<XuanzezuoyeEntity> wrapper);
   	
   	XuanzezuoyeVO selectVO(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
   	
   	List<XuanzezuoyeView> selectListView(Wrapper<XuanzezuoyeEntity> wrapper);
   	
   	XuanzezuoyeView selectView(@Param("ew") Wrapper<XuanzezuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanzezuoyeEntity> wrapper);
   	

}

