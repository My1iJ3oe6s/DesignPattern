package strategy.strategy;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-策略模式
 *
 * 具体策略(ConcreteStrategy)角色
 */
public class BusStrategy implements DriveStrategy {

    @Override
    public int calculatePrice(int km) {
        return 2;
    }
}
