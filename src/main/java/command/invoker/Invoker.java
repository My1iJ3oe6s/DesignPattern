package command.invoker;

import command.command.Command;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-命令模式
 * Invoker（调用者）：调用者即请求发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。
 *  在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作。
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action(){
        this.command.execute();
    }

}
