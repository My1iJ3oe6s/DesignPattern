package strategy.strategy;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-策略模式
 *
 * 具体策略(ConcreteStrategy)角色
 *
 */
public class CarStrategy implements DriveStrategy {

    @Override
    public int calculatePrice(int km) {
        if (km <= 1) {
            return 10;
        } else {
            return (km - 1) * 3 + 10;
        }
    }
}
