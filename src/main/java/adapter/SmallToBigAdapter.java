package adapter;

/**
 * Created by myijoes on 2018/5/14.
 *
 * 设计模式-适配器模式
 * 1.实现目标类的接口
 * 2.包含适配类的引用
 */
public class SmallToBigAdapter implements Big {

    private Small small ;

    public SmallToBigAdapter(Small small) {
        this.small = small;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    @Override
    public void userBigPort() {
        this.small.userSmallPort();
    }
}
