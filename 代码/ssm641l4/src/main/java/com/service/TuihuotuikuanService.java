package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuihuotuikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuihuotuikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuotuikuanView;


/**
 * 退货退款
 *
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface TuihuotuikuanService extends IService<TuihuotuikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuotuikuanVO> selectListVO(Wrapper<TuihuotuikuanEntity> wrapper);
   	
   	TuihuotuikuanVO selectVO(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
   	
   	List<TuihuotuikuanView> selectListView(Wrapper<TuihuotuikuanEntity> wrapper);
   	
   	TuihuotuikuanView selectView(@Param("ew") Wrapper<TuihuotuikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuotuikuanEntity> wrapper);
   	
}

