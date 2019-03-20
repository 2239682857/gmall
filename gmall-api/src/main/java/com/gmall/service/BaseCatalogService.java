package com.gmall.service;

import com.gmall.bean.BaseCatalog1;
import com.gmall.bean.BaseCatalog2;
import com.gmall.bean.BaseCatalog3;

import java.util.List;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/17-17:38
 */

public interface BaseCatalogService {

    public List<BaseCatalog1> selectCatalog1();

    public List<BaseCatalog2> selectCatalog2(String catalog1Id);

    public List<BaseCatalog3> selectCatalog3(String catalog2Id);
}
