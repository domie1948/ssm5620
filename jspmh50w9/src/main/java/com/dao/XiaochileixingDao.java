package com.dao;

import com.entity.XiaochileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaochileixingVO;
import com.entity.view.XiaochileixingView;


/**
 * 小吃类型
 * 
 * @author 
 * @email 
 * @date 2021-03-16 10:41:17
 */
public interface XiaochileixingDao extends BaseMapper<XiaochileixingEntity> {
	
	List<XiaochileixingVO> selectListVO(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
	
	XiaochileixingVO selectVO(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
	
	List<XiaochileixingView> selectListView(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);

	List<XiaochileixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
	
	XiaochileixingView selectView(@Param("ew") Wrapper<XiaochileixingEntity> wrapper);
	
}
