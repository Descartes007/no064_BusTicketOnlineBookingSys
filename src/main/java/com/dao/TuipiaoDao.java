package com.dao;

import com.entity.TuipiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuipiaoVO;
import com.entity.view.TuipiaoView;


/**
 * 退票
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface TuipiaoDao extends BaseMapper<TuipiaoEntity> {
	
	List<TuipiaoVO> selectListVO(@Param("ew") Wrapper<TuipiaoEntity> wrapper);
	
	TuipiaoVO selectVO(@Param("ew") Wrapper<TuipiaoEntity> wrapper);
	
	List<TuipiaoView> selectListView(@Param("ew") Wrapper<TuipiaoEntity> wrapper);

	List<TuipiaoView> selectListView(Pagination page,@Param("ew") Wrapper<TuipiaoEntity> wrapper);
	
	TuipiaoView selectView(@Param("ew") Wrapper<TuipiaoEntity> wrapper);
	
}
