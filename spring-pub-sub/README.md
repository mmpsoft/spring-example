Spring事件发布监听机制

在Spring中使用pub-sub机制，需要一些几个步骤：
1. 定义一个`Event`，该事件需要继承`ApplicationEvent`类。
2. 使用有发布能力的容器，发布Event，如： `ApplicationContext`容器就有发布事件能力，可以执行publishEvent(ApplicationEvent event)发布事件。
3. 定义消费Event的处理，可以使用`@EventListener`注解和实现`ApplicationListener`接口实现消费`Event`的处理。
   1. 实现`ApplicationListener`接口的`onApplicationEvent`方法消费事件
    ```java
   @Component
    public class XxxEventListener implements ApplicationListener<XxxEvent> {
        public void onApplicationEvent(XxxEvent event) {
            System.out.printf("实现接口ApplicationListener消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
        }
    }
   ```
   2. 使用`@EventListener`注解
   ```java
    @Component
    public class XxxEventListener {
        @EventListener
        public void listener(XxxEvent event) {
            System.out.printf("实现接口ApplicationListener消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
        }
    }
   ```
可以使用`@EnableAsync`和@`@Async`两个注解，实现异步消费事件。
   ```java
    @Component
    @EnableAsync  // @EnableAsync使用一次即可，表示开启了异步
    public class XxxEventListener {
    
        @Async
        @EventListener
        public void listener(XxxEvent event) {
            System.out.printf("实现接口ApplicationListener消费事件：%s -> %s\n", Thread.currentThread().getName(), event);
        }
    }
   ```
