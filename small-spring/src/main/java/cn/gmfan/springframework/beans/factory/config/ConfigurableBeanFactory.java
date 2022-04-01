package cn.gmfan.springframework.beans.factory.config;

import cn.gmfan.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * 大多数工厂将实现此配置接口，提供配置Bean创建方式配置。以及提供给客户端添加
 * 自定义方法的接口。
 *
 * @author gmfan
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    /**
     * 单例
     */
    String SCOPE_SINGLETON = "singleton";
    /**
     * 原型
     */
    String SCOPE_PROTOTYPE = "prototype";

    /**
     * 添加客户端自定义执行方法
     *
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
