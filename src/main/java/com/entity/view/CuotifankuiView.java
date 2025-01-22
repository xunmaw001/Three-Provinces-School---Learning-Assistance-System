package com.entity.view;

import com.entity.CuotifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 错题反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
@TableName("cuotifankui")
public class CuotifankuiView  extends CuotifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CuotifankuiView(){
	}
 
 	public CuotifankuiView(CuotifankuiEntity cuotifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, cuotifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
