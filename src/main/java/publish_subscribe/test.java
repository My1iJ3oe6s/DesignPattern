package publish_subscribe;

import com.google.common.collect.Lists;
import publish_subscribe.observer.Observer;
import publish_subscribe.observer.WeatherObserver;
import publish_subscribe.subject.Subject;
import publish_subscribe.subject.WeatherSubject;

import java.util.ArrayList;


/**
 * Created by myijoes on 2018/5/7.
 * <p>
 * 设计模式-观察者模式(发布-订阅)<br/>
 * <p>
 * 定义:观察者设计模式定义了对象间的一种一对多的组合关系，以便一个对象的状态发生变化时，所有依赖于它的对象都得到通知并自动刷新。<br/>
 * <p>
 * 1.观察者(Observer):将自己注册到被观察对象（Subject）中，被观察对象将观察者存放在一个容器（Container）里。<br/>
 * 2.被观察:被观察对象发生了某种变化，从容器中得到所有注册过的观察者，将变化通知观察者。<br/>
 * 3.撤销观察:观察者告诉被观察者要撤销观察，被观察者从容器中将观察者去除。<br/>
 */
public class test {

   public static void main(String[] args) {
      Subject subject = new WeatherSubject();
      //注册监听者
      Observer observer = new WeatherObserver();
      subject.registerObserver(observer);
      //发送消息
      subject.notifyObserver("天气发生变化");
   }


}
