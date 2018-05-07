package publish_subscribe.observer;

/**
 * Created by myijoes on 2018/5/7.
 */
public class WeatherObserver implements Observer {

    @Override
    public <T> void update(T t) {
        System.out.println("### 监听者收到的消息为:" + (String)t);
    }
}
