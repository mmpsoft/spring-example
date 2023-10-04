Spring自定义标签:

e.g：自定义magua-annotation标签，magua标签可以自动添加一个BeanPostProcessor处理。

1.确定命名空间名称、schema虚拟路径、标签名称

2.编写`schema`约束文件`magua-annotation.xsd`

3.在类加载路径下创建`META-INF`目录，编写约束映射文件`spring.schemas`和处理器映射文件`spring.handlers`

4.编写命名空间处理器`MaguaNamespaceHandler`，在init方法中注册`MaguaBeanDefinitionParser`

5.编写标签的解析器`MaguaBeanDefinitionParser`，在`parse`方法中注册`MaguaBeanPostProcessor`

6.编写`MaguaBeanPostProcessor`

==========以上五步是框架开发者写的,以下是框架使用者写的===========

1.在`applicationContext.xml`配置文件中引入命名空间

2.在`applicationContext.xml`配置文件中使用自定义的标签