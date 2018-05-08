package publish_subscribe.observer;

/**
 * Created by myijoes on 2018/5/7.
 *
 * 设计模式-观察者模式
 *
 * 观察对象接口
 * 1.需要有接收主题消息的方法
 *
 */
public interface Observer {

    /**
     *  接收主题发来的消息
     */
    <T> void update(T t);

}
