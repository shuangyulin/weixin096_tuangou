package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequtihuodianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequtihuodianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequtihuodianView;


/**
 * 社区提货点
 *
 * @author 
 * @email 
 * @date 2021-04-03 16:44:21
 */
public interface ShequtihuodianService extends IService<ShequtihuodianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequtihuodianVO> selectListVO(Wrapper<ShequtihuodianEntity> wrapper);
   	
   	ShequtihuodianVO selectVO(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
   	
   	List<ShequtihuodianView> selectListView(Wrapper<ShequtihuodianEntity> wrapper);
   	
   	ShequtihuodianView selectView(@Param("ew") Wrapper<ShequtihuodianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequtihuodianEntity> wrapper);
   	
}

