package com.entity.view;

import com.entity.XiaochileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小吃类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
@TableName("xiaochileixing")
public class XiaochileixingView  extends XiaochileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaochileixingView(){
	}
 
 	public XiaochileixingView(XiaochileixingEntity xiaochileixingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaochileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
