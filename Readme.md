dubbo 微服务demo基于dubbo2.6.0&springboot1.5.16
=====
 
 模块说明：
 -----
    1.common-api : 公共接口
    2.common-util：公共工具类
    3.service-util: 提供者 接口共同依赖
    4.web-util:  消费者 共同依赖
    5.demo-service: 提供者
    6.demo-web:  消费者
 
 服务降级方式 @Reference(mock = "true") 
 --------
    1.mock=true  调用远程服务xxx接口失败后，会在接口目录下查找  xxxxMock实现类调用。
    2.mock=全类名   调用远程服务失败后，会直接查找对应的全类名mock调用。
    3.mock="return aaa"  调用远程服务失败后，直接返回 aaa。
    
 dubbo admin监控管理中心
 -------
    1.可配置服务降级，屏蔽服务，负载均衡方式
    2.配置方式：
        1.上传dubbo-admin.war包到tomcat的webapps目录下
        2.启动tomcat,生成dubbo-admin文件夹
        3.进入tomcat的conf目录，修改配置文件server.xml
            docBase webapps下文件夹名，path：服务访问路径
            在后面添加配置： <Context docBase="dubbo-admin-2.6.0" path="/dubbo" reloadable="true" />
        4.可以进入dubbo-admin目录下，修改properties配置文件，指定zk位置。