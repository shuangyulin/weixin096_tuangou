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


import com.dao.GoumaidingdanDao;
import com.entity.GoumaidingdanEntity;
import com.service.GoumaidingdanService;
import com.entity.vo.GoumaidingdanVO;
import com.entity.view.GoumaidingdanView;

@Service("goumaidingdanService")
public class GoumaidingdanServiceImpl extends ServiceImpl<GoumaidingdanDao, GoumaidingdanEntity> implements GoumaidingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaidingdanEntity> page = this.selectPage(
                new Query<GoumaidingdanEntity>(params).getPage(),
                new EntityWrapper<GoumaidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaidingdanEntity> wrapper) {
		  Page<GoumaidingdanView> page =new Query<GoumaidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaidingdanVO> selectListVO(Wrapper<GoumaidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaidingdanVO selectVO(Wrapper<GoumaidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaidingdanView> selectListView(Wrapper<GoumaidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaidingdanView selectView(Wrapper<GoumaidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
