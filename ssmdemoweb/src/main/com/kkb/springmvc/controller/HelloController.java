package com.kkb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title :
 * @Program :       kks-ssm
 * @Description :
 * @Date :          2020/2/22 13:29
 * @Author :        Y.C.ZHU
 * @Company :       北京云杉世界信息技术有限公司<br>
 * @Copyright :     Copyright (c) 2016<br>
 */
@Controller
public class HelloController {

    @RequestMapping("showView")
    public String showView() {
        return "hello";
    }

    @RequestMapping("showData")
    @ResponseBody
    public String showData() {
        return "showData";
    }
}
