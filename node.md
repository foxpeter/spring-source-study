##spring 加载流程
- AbstractApplicationContext -> refresh()
https://www.jianshu.com/p/12392dc28a9f
https://blog.csdn.net/u012291108/article/details/51898246

（1）initPropertySources证符合Spring的开放式结构设计，给用户最大扩展Spring的能力。用户可以根据自身的需要重写initPropertySourece方法，并在方法中进行个性化的属性处理及设置。

（2）validateRequiredProperties则是对属性进行验证，那么如何验证呢？举个融合两句代码的小例子来理解。



- AbstractApplicationContext -> obtainFreshBeanFactory
-> AbstractRefreshableApplicationContext -> refreshBeanFactory -> createBeanFactory -> **DefaultListableBeanFactory**