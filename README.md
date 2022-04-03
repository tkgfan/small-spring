# small-spring

Small-Spring项目主要实现容器化管理对象的创建与对象间之间的依赖关系，以及基于Cglib 与 JDK Proxy 代理实现了 AOP 功能。

## 已实现

### IOC

- 属性注入
- xml文件配置资源解析
- 应用上下文
- 自定义初始化和销毁
- Aware感知容器对象
- 容器事件监听器

### AOP

- 自动扫描注册对象

- 注解注入对象属性信息
