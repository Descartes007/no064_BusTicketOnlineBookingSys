package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichepiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichepiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichepiaoView;


/**
 * 汽车票
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface QichepiaoService extends IService<QichepiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichepiaoVO> selectListVO(Wrapper<QichepiaoEntity> wrapper);
   	
   	QichepiaoVO selectVO(@Param("ew") Wrapper<QichepiaoEntity> wrapper);
   	
   	List<QichepiaoView> selectListView(Wrapper<QichepiaoEntity> wrapper);
   	
   	QichepiaoView selectView(@Param("ew") Wrapper<QichepiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichepiaoEntity> wrapper);
   	
}

