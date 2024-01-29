package com.dao;

import com.entity.TuihuotuikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuihuotuikuanVO;
import com.entity.view.TuihuotuikuanView;


/**
 * 退货退款
 * 
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface TuihuotuikuanDao extends BaseMapper<TuihuotuikuanEntity> {
	
	List<TuihuotuikuanVO> selectListVO(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
	
	TuihuotuikuanVO selectVO(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
	
	List<TuihuotuikuanView> selectListView(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);

	List<TuihuotuikuanView> selectListView(Pagination page,@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
	
	TuihuotuikuanView selectView(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
	
}
