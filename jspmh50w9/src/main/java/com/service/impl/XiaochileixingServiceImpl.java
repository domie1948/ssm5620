package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaochileixingDao;
import com.entity.XiaochileixingEntity;
import com.service.XiaochileixingService;
import com.entity.vo.XiaochileixingVO;
import com.entity.view.XiaochileixingView;

@Service("xiaochileixingService")
public class XiaochileixingServiceImpl extends ServiceImpl<XiaochileixingDao, XiaochileixingEntity> implements XiaochileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaochileixingEntity> page = this.selectPage(
                new Query<XiaochileixingEntity>(params).getPage(),
                new EntityWrapper<XiaochileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaochileixingEntity> wrapper) {
		  Page<XiaochileixingView> page =new Query<XiaochileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaochileixingVO> selectListVO(Wrapper<XiaochileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaochileixingVO selectVO(Wrapper<XiaochileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaochileixingView> selectListView(Wrapper<XiaochileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaochileixingView selectView(Wrapper<XiaochileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
