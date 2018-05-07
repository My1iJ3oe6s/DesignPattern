package publish_subscribe.subject;

import com.google.common.collect.Lists;
import publish_subscribe.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myijoes on 2018/5/7.
 * <p>
 * 设计模式-观察者模式
 * <p>
 * 主题的实现类
 */
public class WeatherSubject implements Subject {

    private List<Observer> observers;

    public WeatherSubject() {
        this.observers = Lists.newArrayList();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(String subjectData) {
       observers.forEach(c ->c.update(subjectData));
    }
}
