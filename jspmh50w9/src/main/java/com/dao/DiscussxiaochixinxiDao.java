package com.dao;

import com.entity.DiscussxiaochixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaochixinxiVO;
import com.entity.view.DiscussxiaochixinxiView;


/**
 * 小吃信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface DiscussxiaochixinxiDao extends BaseMapper<DiscussxiaochixinxiEntity> {
	
	List<DiscussxiaochixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
	
	DiscussxiaochixinxiVO selectVO(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
	
	List<DiscussxiaochixinxiView> selectListView(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);

	List<DiscussxiaochixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
	
	DiscussxiaochixinxiView selectView(@Param("ew") Wrapper<DiscussxiaochixinxiEntity> wrapper);
	
}
