# bootdubbo

#### Zookeeper 的配置  
一、单机模式  
1.1、编辑配置文件  

在“conf”目录下，新建一个名为“zoo.cfg”的文件，其中内容如下：

```
tickTime=2000  
dataDir= /usr/myenv/zookeeper-3.4.8/data  (填写自己的data目录)  
dataLogDir=/usr/myenv/zookeeper-3.4.8/logs  
clientPort=2181
```

参数说明:  
```
#tickTime: zookeeper中使用的基本时间单位, 毫秒值.
#dataDir: 数据目录. 可以是任意目录.
#dataLogDir: log目录, 同样可以是任意目录. 如果没有设置该参数, 将使用和#dataDir相同的设置.
#clientPort: 监听client连接的端口号.
```
1.2、运行ZooKeeper Server  
 执行./bin/zkServer.sh start命令，运行ZooKeeper Server进程 
 注:命令telnet 127.0.0.1 2181 连接成功验证Zookeeper 是否启动成功
 停止：./bin/zkServer.sh stop  
 也可以执行bin/zkServer.sh start-foreground命令，非后台运行ZooKeeper Server进程  