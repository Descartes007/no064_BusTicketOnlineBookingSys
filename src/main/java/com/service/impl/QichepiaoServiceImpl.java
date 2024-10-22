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


import com.dao.QichepiaoDao;
import com.entity.QichepiaoEntity;
import com.service.QichepiaoService;
import com.entity.vo.QichepiaoVO;
import com.entity.view.QichepiaoView;

@Service("qichepiaoService")
public class QichepiaoServiceImpl extends ServiceImpl<QichepiaoDao, QichepiaoEntity> implements QichepiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichepiaoEntity> page = this.selectPage(
                new Query<QichepiaoEntity>(params).getPage(),
                new EntityWrapper<QichepiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichepiaoEntity> wrapper) {
		  Page<QichepiaoView> page =new Query<QichepiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichepiaoVO> selectListVO(Wrapper<QichepiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichepiaoVO selectVO(Wrapper<QichepiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichepiaoView> selectListView(Wrapper<QichepiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichepiaoView selectView(Wrapper<QichepiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
