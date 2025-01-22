package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshitixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshitixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshitixingView;


/**
 * 教师提醒
 *
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface JiaoshitixingService extends IService<JiaoshitixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshitixingVO> selectListVO(Wrapper<JiaoshitixingEntity> wrapper);
   	
   	JiaoshitixingVO selectVO(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
   	
   	List<JiaoshitixingView> selectListView(Wrapper<JiaoshitixingEntity> wrapper);
   	
   	JiaoshitixingView selectView(@Param("ew") Wrapper<JiaoshitixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshitixingEntity> wrapper);
   	

}

