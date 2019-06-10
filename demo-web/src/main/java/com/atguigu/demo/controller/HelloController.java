/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: HelloController
 * @Package com.atguigu.demo.controller
 * @author: YangXianWei
 * @date: 2019/6/10 11:12
 * @since JDK 1.8
 */
package com.atguigu.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @AUTHOR :  YangXianWei
 * @DATE :    2019/6/10 11:12
 * @DESCRIPTION : TODO(用一句话描述该类做什么)
 * @since JDK 1.8
 */
@RestController
public class HelloController {

    @Reference
    HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
