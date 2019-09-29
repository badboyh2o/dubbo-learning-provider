1.安装zookeeper，并启动

   docker run --privileged=true -d --name zookeeper --restart=always -p 2181:2181 47.106.95.111:10010/zookeeper:20190928

2.搭建服务提供方，将服务提供者注册到 zookeeper

    引入依赖: dubbo zkclient
    
    配置dubbo扫描包、和zookeeper注册中心
    
    使用dubbo注解 @Service 发布服务
    
 3.启动 服务提供方