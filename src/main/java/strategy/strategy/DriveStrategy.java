package strategy.strategy;

/**
 * Created by myijoes on 2018/5/8.
 *
 * 设计模式-策略模式
 *
 * 抽象策略角色
 */
public interface DriveStrategy {

    int calculatePrice(int km);
}
