package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuipiaoDao;
import com.entity.TuipiaoEntity;
import com.service.TuipiaoService;
import com.entity.vo.TuipiaoVO;
import com.entity.view.TuipiaoView;

@Service("tuipiaoService")
public class TuipiaoServiceImpl extends ServiceImpl<TuipiaoDao, TuipiaoEntity> implements TuipiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuipiaoEntity> page = this.selectPage(
                new Query<TuipiaoEntity>(params).getPage(),
                new EntityWrapper<TuipiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuipiaoEntity> wrapper) {
		  Page<TuipiaoView> page =new Query<TuipiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuipiaoVO> selectListVO(Wrapper<TuipiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuipiaoVO selectVO(Wrapper<TuipiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuipiaoView> selectListView(Wrapper<TuipiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuipiaoView selectView(Wrapper<TuipiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
