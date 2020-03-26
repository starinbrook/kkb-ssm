package com.kkb.ssm.test;

import com.kkb.ssm.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title :
 * @Program :       kks-ssm
 * @Description :
 * @Date :          2020/3/24 23:43
 * @Author :        Y.C.ZHU
 * @Company :       北京云杉世界信息技术有限公司<br>
 * @Copyright :     Copyright (c) 2016<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-main.xml")
public class TestService {

    @Autowired
    ItemService itemService;

    @Test
    public void testQuery() {
        itemService.queryItemList();
    }
}
