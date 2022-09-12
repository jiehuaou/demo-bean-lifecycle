# The Lifecycle of Spring Beans

## What are Spring Beans?

Spring Beans are Java Objects or Instances which will be created and managed by Spring IOC/DI container.

## Bean Creation and Instantiate
As soon as bean created and It will be instantiated and loaded into ApplicationContext and JVM memory.

## Populating Bean properties
Spring container will create a bean id, scope, default values based on the bean definition.

## Post-initialization
Spring provides Aware interfaces to access application bean meta-data details and callback methods to hook into the bean life cycle to **execute custom application-specific logic**.

## Ready to Serve
Now, Bean is created and injected all the dependencies and should be executed all the Aware and callback methods implementation. Bean is ready to serve.

## Pre-destroy
Spring provides callback methods to execute custom application-specific logic and clean-ups before destroying a bean from ApplicationContext.

## Bean Destroyed
Bean will be removed or destroyed from and JVM memory.

## How to Customize the Bean Life Cycle
Spring framework provides the following four ways for controlling life cycle events of a bean:

1. InitializingBean and DisposableBean callback interfaces
    * BeanPostProcessor.postProcessBeforeInitialization  // Before Initialization
    * BeanPostProcessor.postProcessAfterInitialization   // After Initialization
    * DisposableBean.destroy()                           // before Bean destroys 
2. Aware interfaces (BeanNameAware, ApplicationContextAware) for specific behavior
3. Custom init() and destroy() methods in bean configuration file
```java
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
        public MySpringBean mySpringBean(){
            return new MySpringBean();
        }
```    
4. @PostConstruct and @PreDestroy annotations
```JAVA
    @PostConstruct
    public void postConstruct() {
        System.out.println("--- @PostConstruct executed ---");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("--- @PreDestroy executed ---");
    }
```    









