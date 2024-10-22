package com.dao;

import com.entity.QichepiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichepiaoVO;
import com.entity.view.QichepiaoView;


/**
 * 汽车票
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface QichepiaoDao extends BaseMapper<QichepiaoEntity> {
	
	List<QichepiaoVO> selectListVO(@Param("ew") Wrapper<QichepiaoEntity> wrapper);
	
	QichepiaoVO selectVO(@Param("ew") Wrapper<QichepiaoEntity> wrapper);
	
	List<QichepiaoView> selectListView(@Param("ew") Wrapper<QichepiaoEntity> wrapper);

	List<QichepiaoView> selectListView(Pagination page,@Param("ew") Wrapper<QichepiaoEntity> wrapper);
	
	QichepiaoView selectView(@Param("ew") Wrapper<QichepiaoEntity> wrapper);
	
}
