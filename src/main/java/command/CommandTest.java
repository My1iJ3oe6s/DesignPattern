package command;

import command.command.CloseCommand;
import command.command.OpenCommand;
import command.invoker.Invoker;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-命令模式
 *
 * 定义: 将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。
 *      命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 *
 * 在命令模式结构图中包含如下几个角色:
 * 1)Command（抽象命令类）：抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作。
 * 2)ConcreteCommand（具体命令类）：具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。
 *  在实现execute()方法时，将调用接收者对象的相关操作(Action)。
 * 3)Invoker（调用者）：调用者即请求发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。
 *  在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作。
 * 4)Receiver（接收者）：接收者执行与请求相关的操作，它具体实现对请求的业务处理。
 *
 */
public class CommandTest {

    public static void main(String[] args) {
        //测试开启命令
        Invoker invoker = new Invoker();
        invoker.setCommand(new OpenCommand());
        invoker.action();
        System.out.println("==============================================");
        //测试关闭命令
        Invoker invoker1 = new Invoker();
        invoker1.setCommand(new CloseCommand());
        invoker1.action();

    }
}
