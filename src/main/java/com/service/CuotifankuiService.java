package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CuotifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CuotifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CuotifankuiView;


/**
 * 错题反馈
 *
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
public interface CuotifankuiService extends IService<CuotifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CuotifankuiVO> selectListVO(Wrapper<CuotifankuiEntity> wrapper);
   	
   	CuotifankuiVO selectVO(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
   	
   	List<CuotifankuiView> selectListView(Wrapper<CuotifankuiEntity> wrapper);
   	
   	CuotifankuiView selectView(@Param("ew") Wrapper<CuotifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CuotifankuiEntity> wrapper);
   	

}

