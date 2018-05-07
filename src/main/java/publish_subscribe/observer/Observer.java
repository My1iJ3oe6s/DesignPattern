package publish_subscribe.observer;

/**
 * Created by myijoes on 2018/5/7.
 */
public interface Observer {

    /**
     *  接收主题发来的消息
     */
    <T> void update(T t);

}
