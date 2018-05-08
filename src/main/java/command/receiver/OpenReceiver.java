package command.receiver;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-命令模式
 *
 * 接收者的实现类
 */
public class OpenReceiver implements  Receiver {

    @Override
    public void action() {
        System.out.println("执行开启的操作");
    }
}
