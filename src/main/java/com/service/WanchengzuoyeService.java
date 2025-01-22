package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanchengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanchengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanchengzuoyeView;


/**
 * 完成作业
 *
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface WanchengzuoyeService extends IService<WanchengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanchengzuoyeVO> selectListVO(Wrapper<WanchengzuoyeEntity> wrapper);
   	
   	WanchengzuoyeVO selectVO(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
   	
   	List<WanchengzuoyeView> selectListView(Wrapper<WanchengzuoyeEntity> wrapper);
   	
   	WanchengzuoyeView selectView(@Param("ew") Wrapper<WanchengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanchengzuoyeEntity> wrapper);
   	

}

