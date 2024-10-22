package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuipiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuipiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuipiaoView;


/**
 * 退票
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface TuipiaoService extends IService<TuipiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuipiaoVO> selectListVO(Wrapper<TuipiaoEntity> wrapper);
   	
   	TuipiaoVO selectVO(@Param("ew") Wrapper<TuipiaoEntity> wrapper);
   	
   	List<TuipiaoView> selectListView(Wrapper<TuipiaoEntity> wrapper);
   	
   	TuipiaoView selectView(@Param("ew") Wrapper<TuipiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuipiaoEntity> wrapper);
   	
}

