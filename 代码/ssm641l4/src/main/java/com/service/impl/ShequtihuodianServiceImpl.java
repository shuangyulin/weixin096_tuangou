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


import com.dao.ShequtihuodianDao;
import com.entity.ShequtihuodianEntity;
import com.service.ShequtihuodianService;
import com.entity.vo.ShequtihuodianVO;
import com.entity.view.ShequtihuodianView;

@Service("shequtihuodianService")
public class ShequtihuodianServiceImpl extends ServiceImpl<ShequtihuodianDao, ShequtihuodianEntity> implements ShequtihuodianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequtihuodianEntity> page = this.selectPage(
                new Query<ShequtihuodianEntity>(params).getPage(),
                new EntityWrapper<ShequtihuodianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequtihuodianEntity> wrapper) {
		  Page<ShequtihuodianView> page =new Query<ShequtihuodianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequtihuodianVO> selectListVO(Wrapper<ShequtihuodianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequtihuodianVO selectVO(Wrapper<ShequtihuodianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequtihuodianView> selectListView(Wrapper<ShequtihuodianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequtihuodianView selectView(Wrapper<ShequtihuodianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
