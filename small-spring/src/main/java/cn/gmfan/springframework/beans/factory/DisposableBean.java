package cn.gmfan.springframework.beans.factory;

/**
 * @author gmfan
 */
public interface DisposableBean {
    /**
     * 销毁方法
     * @throws Exception
     */
    void destroy() throws Exception;
}
