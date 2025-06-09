package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaochileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaochileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaochileixingView;


/**
 * 小吃类型
 *
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface XiaochileixingService extends IService<XiaochileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaochileixingVO> selectListVO(Wrapper<XiaochileixingEntity> wrapper);
   	
   	XiaochileixingVO selectVO(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
   	
   	List<XiaochileixingView> selectListView(Wrapper<XiaochileixingEntity> wrapper);
   	
   	XiaochileixingView selectView(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaochileixingEntity> wrapper);
   	
}

