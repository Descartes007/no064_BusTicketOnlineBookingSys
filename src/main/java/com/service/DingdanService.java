package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanView;


/**
 * 订单
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface DingdanService extends IService<DingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanVO> selectListVO(Wrapper<DingdanEntity> wrapper);
   	
   	DingdanVO selectVO(@Param("ew") Wrapper<DingdanEntity> wrapper);
   	
   	List<DingdanView> selectListView(Wrapper<DingdanEntity> wrapper);
   	
   	DingdanView selectView(@Param("ew") Wrapper<DingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanEntity> wrapper);
   	
}

