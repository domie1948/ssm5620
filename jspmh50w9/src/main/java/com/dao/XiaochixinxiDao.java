package com.dao;

import com.entity.XiaochixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaochixinxiVO;
import com.entity.view.XiaochixinxiView;


/**
 * 小吃信息
 * 
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface XiaochixinxiDao extends BaseMapper<XiaochixinxiEntity> {
	
	List<XiaochixinxiVO> selectListVO(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
	
	XiaochixinxiVO selectVO(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
	
	List<XiaochixinxiView> selectListView(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);

	List<XiaochixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
	
	XiaochixinxiView selectView(@Param("ew") Wrapper<XiaochixinxiEntity> wrapper);
	
}
