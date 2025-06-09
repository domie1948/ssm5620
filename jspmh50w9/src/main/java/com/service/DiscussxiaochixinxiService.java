package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaochixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaochixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaochixinxiView;


/**
 * 小吃信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface DiscussxiaochixinxiService extends IService<DiscussxiaochixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaochixinxiVO> selectListVO(Wrapper<DiscussxiaochixinxiEntity> wrapper);
   	
   	DiscussxiaochixinxiVO selectVO(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
   	
   	List<DiscussxiaochixinxiView> selectListView(Wrapper<DiscussxiaochixinxiEntity> wrapper);
   	
   	DiscussxiaochixinxiView selectView(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaochixinxiEntity> wrapper);
   	
}

