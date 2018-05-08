package strategy;

import strategy.strategy.DriveStrategy;

/**
 * Created by myijoes on 2018/5/8.
 * <p>
 * 设计模式-策略模式
 * <p>
 * 环境(Context)角色：持有一个Strategy的引用
 */
public class TranficCalculator {

    DriveStrategy driveStrategy;

    public TranficCalculator(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public DriveStrategy getDriveStrategy() {
        return driveStrategy;
    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    /**
     *
     */
    public int calculatePrice(int km) {
        return driveStrategy.calculatePrice(km);
    }
}
