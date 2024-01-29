package com.entity.view;

import com.entity.GoumaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
@TableName("goumaidingdan")
public class GoumaidingdanView  extends GoumaidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaidingdanView(){
	}
 
 	public GoumaidingdanView(GoumaidingdanEntity goumaidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, goumaidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
