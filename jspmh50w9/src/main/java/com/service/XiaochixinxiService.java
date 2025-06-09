package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaochixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaochixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaochixinxiView;


/**
 * 小吃信息
 *
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface XiaochixinxiService extends IService<XiaochixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaochixinxiVO> selectListVO(Wrapper<XiaochixinxiEntity> wrapper);
   	
   	XiaochixinxiVO selectVO(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
   	
   	List<XiaochixinxiView> selectListView(Wrapper<XiaochixinxiEntity> wrapper);
   	
   	XiaochixinxiView selectView(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaochixinxiEntity> wrapper);
   	
}

