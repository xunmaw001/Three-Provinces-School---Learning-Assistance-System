package com.entity.view;

import com.entity.CuotilianxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 错题练习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
@TableName("cuotilianxi")
public class CuotilianxiView  extends CuotilianxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CuotilianxiView(){
	}
 
 	public CuotilianxiView(CuotilianxiEntity cuotilianxiEntity){
 	try {
			BeanUtils.copyProperties(this, cuotilianxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
