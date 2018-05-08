package command.command;

import command.receiver.CloseReceiver;
import command.receiver.Receiver;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-命令模式
 * ConcreteCommand（具体命令类）：具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。
 * 在实现execute()方法时，将调用接收者对象的相关操作(Action)。
 *
 */
public class CloseCommand implements Command {

    private Receiver closeReceiver;

    public CloseCommand() {
        this.closeReceiver = new CloseReceiver();
    }

    public Receiver getCloseReceiver() {
        return closeReceiver;
    }

    public void setCloseReceiver(Receiver closeReceiver) {
        this.closeReceiver = closeReceiver;
    }

    @Override
    public void execute() {
        closeReceiver.action();
    }
}
