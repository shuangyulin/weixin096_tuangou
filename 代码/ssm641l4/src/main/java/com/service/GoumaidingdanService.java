package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaidingdanView;


/**
 * 购买订单
 *
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface GoumaidingdanService extends IService<GoumaidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaidingdanVO> selectListVO(Wrapper<GoumaidingdanEntity> wrapper);
   	
   	GoumaidingdanVO selectVO(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
   	
   	List<GoumaidingdanView> selectListView(Wrapper<GoumaidingdanEntity> wrapper);
   	
   	GoumaidingdanView selectView(@Param("ew") Wrapper<GoumaidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaidingdanEntity> wrapper);
   	
}

