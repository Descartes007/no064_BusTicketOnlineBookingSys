package com.dao;

import com.entity.FankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FankuiVO;
import com.entity.view.FankuiView;


/**
 * 反馈
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:05:57
 */
public interface FankuiDao extends BaseMapper<FankuiEntity> {
	
	List<FankuiVO> selectListVO(@Param("ew") Wrapper<FankuiEntity> wrapper);
	
	FankuiVO selectVO(@Param("ew") Wrapper<FankuiEntity> wrapper);
	
	List<FankuiView> selectListView(@Param("ew") Wrapper<FankuiEntity> wrapper);

	List<FankuiView> selectListView(Pagination page,@Param("ew") Wrapper<FankuiEntity> wrapper);
	
	FankuiView selectView(@Param("ew") Wrapper<FankuiEntity> wrapper);
	
}
