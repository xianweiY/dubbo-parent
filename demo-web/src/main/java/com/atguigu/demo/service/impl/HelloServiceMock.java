/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: HelloServiceMock
 * @Package com.atguigu.demo.service.impl
 * @author: YangXianWei
 * @date: 2019/6/10 11:38
 * @since JDK 1.8
 */
package com.atguigu.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.demo.service.HelloService;

import java.util.UUID;

/**
 * @ClassName : HelloServiceMock
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 11:38
 * @DESCRIPTION : TODO(mock测试)
 * @since JDK 1.8
 */
@Service
public class HelloServiceMock implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name + " ,this is mock! uuid:" + UUID.randomUUID().toString().substring(0, 5);
    }
}
