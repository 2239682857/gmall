package com.gmal.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.BaseCatalog1;
import com.gmall.bean.BaseCatalog2;
import com.gmall.service.BaseCatalogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/17-17:37
 */
@RestController
public class CatalogController {

    @Reference
    private BaseCatalogService baseCatalogService;

    @RequestMapping("/getCataLog1")
    public List<BaseCatalog1> getCataLog1() {
        List<BaseCatalog1> baseCatalog1s = baseCatalogService.selectCatalog1();
        return baseCatalog1s;
    }

    @RequestMapping("/getCataLog2")
    public List<BaseCatalog2> getCataLog2(String catalog1Id) {
        List<BaseCatalog2> baseCatalog2s = baseCatalogService.selectCatalog2(catalog1Id);
        return baseCatalog2s;
    }
}
