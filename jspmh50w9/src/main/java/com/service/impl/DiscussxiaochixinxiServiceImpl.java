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


import com.dao.DiscussxiaochixinxiDao;
import com.entity.DiscussxiaochixinxiEntity;
import com.service.DiscussxiaochixinxiService;
import com.entity.vo.DiscussxiaochixinxiVO;
import com.entity.view.DiscussxiaochixinxiView;

@Service("discussxiaochixinxiService")
public class DiscussxiaochixinxiServiceImpl extends ServiceImpl<DiscussxiaochixinxiDao, DiscussxiaochixinxiEntity> implements DiscussxiaochixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaochixinxiEntity> page = this.selectPage(
                new Query<DiscussxiaochixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaochixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaochixinxiEntity> wrapper) {
		  Page<DiscussxiaochixinxiView> page =new Query<DiscussxiaochixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaochixinxiVO> selectListVO(Wrapper<DiscussxiaochixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaochixinxiVO selectVO(Wrapper<DiscussxiaochixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaochixinxiView> selectListView(Wrapper<DiscussxiaochixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaochixinxiView selectView(Wrapper<DiscussxiaochixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
