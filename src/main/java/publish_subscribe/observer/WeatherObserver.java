package publish_subscribe.observer;

/**
 * Created by myijoes on 2018/5/7.
 *
 * 设计模式-观察者模式
 *
 * 观察者的实现类
 */
public class WeatherObserver implements Observer {

    @Override
    public <T> void update(T t) {
        System.out.println("### 监听者收到的消息为:" + (String)t);
    }
}
