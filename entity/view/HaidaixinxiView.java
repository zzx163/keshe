package com.entity.view;

import com.entity.HaidaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 还贷信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("haidaixinxi")
public class HaidaixinxiView  extends HaidaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaidaixinxiView(){
	}
 
 	public HaidaixinxiView(HaidaixinxiEntity haidaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, haidaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
