package com.entity.view;

import com.entity.WanchengzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 完成作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 10:37:30
 */
@TableName("wanchengzuoye")
public class WanchengzuoyeView  extends WanchengzuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanchengzuoyeView(){
	}
 
 	public WanchengzuoyeView(WanchengzuoyeEntity wanchengzuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, wanchengzuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
