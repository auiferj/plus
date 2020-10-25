# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### 构建过程
* 使用IDEA初始化一个项目plus
* 创建一个application.yml，配置数据源信息;删除原来的application.properties
* 在pom.xml中配置mybatis-plus坐标,并指定MySQL驱动的版本<version>5.1.6</version>
* 在src/main/java下新建User(指定主键类型type),UserMapper
* 在PlusMapper中配置扫描器@MapperScan,它是mybatis的注解
* 在src/test/java下PlusApplicationTests中编写测试代码,这里使用新版本的Spring Boot，所以默认是junit5,不在需要@RunWith(SpringRunner.class)
