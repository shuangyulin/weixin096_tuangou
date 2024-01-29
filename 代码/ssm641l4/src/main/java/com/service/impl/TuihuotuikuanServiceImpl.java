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


import com.dao.TuihuotuikuanDao;
import com.entity.TuihuotuikuanEntity;
import com.service.TuihuotuikuanService;
import com.entity.vo.TuihuotuikuanVO;
import com.entity.view.TuihuotuikuanView;

@Service("tuihuotuikuanService")
public class TuihuotuikuanServiceImpl extends ServiceImpl<TuihuotuikuanDao, TuihuotuikuanEntity> implements TuihuotuikuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuotuikuanEntity> page = this.selectPage(
                new Query<TuihuotuikuanEntity>(params).getPage(),
                new EntityWrapper<TuihuotuikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuotuikuanEntity> wrapper) {
		  Page<TuihuotuikuanView> page =new Query<TuihuotuikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuotuikuanVO> selectListVO(Wrapper<TuihuotuikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuotuikuanVO selectVO(Wrapper<TuihuotuikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuotuikuanView> selectListView(Wrapper<TuihuotuikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuotuikuanView selectView(Wrapper<TuihuotuikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
