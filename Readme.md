dubbo 微服务  服务降级方式 @Reference(mock = "true") 
1.mock=true  调用远程服务xxx接口失败后，会在接口目录下查找  xxxxMock实现类调用。
2.mock=全类名   调用远程服务失败后，会直接查找对应的全类名mock调用。
3.mock="return aaa"  调用远程服务失败后，直接返回 aaa。