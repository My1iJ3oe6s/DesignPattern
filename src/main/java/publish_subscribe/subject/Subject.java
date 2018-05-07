package publish_subscribe.subject;

import com.google.common.collect.Lists;
import publish_subscribe.observer.Observer;

import java.util.ArrayList;

/**
 * Created by myijoes on 2018/5/7.
 *
 * 设计模式-观察者模式<br/>
 *
 * 主题(Subject)[被监听者]
 * 1.注册监听者
 * 2.移除监听者
 * 3.通知监听者
 *
 */
public interface Subject {


    /**
     *  注册观察者
     */
    void registerObserver(Observer observer);

    /**
     *  移除观察者
     */
    void removeObserver(Observer observer);

    /**
     *  通知观察者
     */
    void notifyObserver(String object);
}
