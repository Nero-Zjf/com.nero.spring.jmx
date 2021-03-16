# com.nero.spring.jmx
spring集成jmx

目前实现了最简单的集成，只是注册了MBeanExporter bean.如果需要定义MBean的服务器则查看语雀

通过JVM参数开启用户口令认证
-Dcom.sun.management.jmxremote=true
-Djava.rmi.server.hostname=10.211.55.2
-Dcom.sun.management.jmxremote.port=8081
-Dcom.sun.management.jmxremote.ssl=false
-Dcom.sun.management.jmxremote.authenticate=true
-Dcom.sun.management.jmxremote.access.file=jmxremote.access
-Dcom.sun.management.jmxremote.password.file=jmxremote.password