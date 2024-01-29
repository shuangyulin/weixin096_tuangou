package com.dao;

import com.entity.ShequtihuodianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequtihuodianVO;
import com.entity.view.ShequtihuodianView;


/**
 * 社区提货点
 * 
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface ShequtihuodianDao extends BaseMapper<ShequtihuodianEntity> {
	
	List<ShequtihuodianVO> selectListVO(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
	
	ShequtihuodianVO selectVO(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
	
	List<ShequtihuodianView> selectListView(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);

	List<ShequtihuodianView> selectListView(Pagination page,@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
	
	ShequtihuodianView selectView(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
	
}
