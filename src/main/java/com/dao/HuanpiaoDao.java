package com.dao;

import com.entity.HuanpiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanpiaoVO;
import com.entity.view.HuanpiaoView;


/**
 * 换票
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface HuanpiaoDao extends BaseMapper<HuanpiaoEntity> {
	
	List<HuanpiaoVO> selectListVO(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
	
	HuanpiaoVO selectVO(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
	
	List<HuanpiaoView> selectListView(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);

	List<HuanpiaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
	
	HuanpiaoView selectView(@Param("ew") Wrapper<HuanpiaoEntity> wrapper);
	
}
