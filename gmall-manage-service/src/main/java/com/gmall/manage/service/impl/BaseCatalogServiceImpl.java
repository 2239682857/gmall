package com.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.BaseCatalog1;
import com.gmall.bean.BaseCatalog2;
import com.gmall.bean.BaseCatalog3;
import com.gmall.manage.mapper.BaseCatalog1Mapper;
import com.gmall.manage.mapper.BaseCatalog2Mapper;
import com.gmall.manage.mapper.BaseCatalog3Mapper;
import com.gmall.service.BaseCatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/17-18:06
 */
@Service
public class BaseCatalogServiceImpl implements BaseCatalogService {
    @Autowired
    private BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    private BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    private BaseCatalog3Mapper baseCatalog3Mapper;


    @Override
    public List<BaseCatalog1> selectCatalog1() {
        List<BaseCatalog1> baseCatalog1s = baseCatalog1Mapper.selectAll();
        return baseCatalog1s;
    }

    @Override
    public List<BaseCatalog2> selectCatalog2(String catalog1Id) {
        BaseCatalog2 baseCatalog2 = new BaseCatalog2();
        baseCatalog2.setCatalog1Id(catalog1Id);
        List<BaseCatalog2> baseCatalog2s = baseCatalog2Mapper.select(baseCatalog2);
        return baseCatalog2s;
    }

    @Override
    public List<BaseCatalog3> selectCatalog3(String catalog2Id) {
        List<BaseCatalog3> baseCatalog3s = baseCatalog3Mapper.selectAll();
        return baseCatalog3s;
    }

}
