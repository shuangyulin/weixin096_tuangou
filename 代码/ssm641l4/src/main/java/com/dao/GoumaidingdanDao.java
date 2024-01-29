package com.dao;

import com.entity.GoumaidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaidingdanVO;
import com.entity.view.GoumaidingdanView;


/**
 * 购买订单
 * 
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface GoumaidingdanDao extends BaseMapper<GoumaidingdanEntity> {
	
	List<GoumaidingdanVO> selectListVO(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
	
	GoumaidingdanVO selectVO(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
	
	List<GoumaidingdanView> selectListView(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);

	List<GoumaidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
	
	GoumaidingdanView selectView(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
	
}
