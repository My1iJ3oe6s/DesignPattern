package strategy;

import strategy.strategy.BusStrategy;
import strategy.strategy.CarStrategy;

/**
 * Created by myijoes on 2018/5/8.
 * <p>
 * 设计模式-策略模式
 * <p>
 * 三要素:
 * ●　环境(Context)角色：持有一个Strategy的引用。
 * ●　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * ●　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。
 * <p>
 * <p>
 * 优点
 * 1）结构清晰明了、使用简单直观
 * 2）耦合度相对较低，扩展方便
 * 3）操作封装因为更为测地、数据更为安全
 * <p>
 * 模拟场景:
 * 计算不同的出行方式行驶指定路程产生的费用
 */
public class StrategyTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        TranficCalculator tranficCalculator = new TranficCalculator(new BusStrategy());
        int busPrice = tranficCalculator.calculatePrice(20);
        System.out.println("乘坐公交20km的费用是:" + busPrice);

        TranficCalculator ctranficCalculator = new TranficCalculator(new CarStrategy());
        int carPrice = ctranficCalculator.calculatePrice(20);
        System.out.println("乘坐出租20km的费用是:" + carPrice);
    }
}
