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


import com.dao.XiaochixinxiDao;
import com.entity.XiaochixinxiEntity;
import com.service.XiaochixinxiService;
import com.entity.vo.XiaochixinxiVO;
import com.entity.view.XiaochixinxiView;

@Service("xiaochixinxiService")
public class XiaochixinxiServiceImpl extends ServiceImpl<XiaochixinxiDao, XiaochixinxiEntity> implements XiaochixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaochixinxiEntity> page = this.selectPage(
                new Query<XiaochixinxiEntity>(params).getPage(),
                new EntityWrapper<XiaochixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaochixinxiEntity> wrapper) {
		  Page<XiaochixinxiView> page =new Query<XiaochixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaochixinxiVO> selectListVO(Wrapper<XiaochixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaochixinxiVO selectVO(Wrapper<XiaochixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaochixinxiView> selectListView(Wrapper<XiaochixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaochixinxiView selectView(Wrapper<XiaochixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
