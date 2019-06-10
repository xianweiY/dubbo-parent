/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: HelloServiceImpl
 * @Package com.atguigu.demo.service.impl
 * @author: YangXianWei
 * @date: 2019/6/10 11:10
 * @since JDK 1.8
 */
package com.atguigu.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.demo.service.HelloService;

import java.util.UUID;

/**
 * @ClassName : HelloServiceImpl
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 11:10
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
       return "hello " + name + "!  调用远程服务成功 ！UUID:" + UUID.randomUUID().toString().substring(0,5);
    }
}
