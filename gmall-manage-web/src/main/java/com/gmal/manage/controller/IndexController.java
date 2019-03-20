package com.gmal.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/16-10:49
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }
}
