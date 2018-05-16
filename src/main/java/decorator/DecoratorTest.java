package decorator;

/**
 * Created by myijoes on 2018/5/14.
 *
 * 设计模式-装饰者模式
 *
 * 动态给一个对象添加一些额外的职责
 *
 * 装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
 *
 */
public class DecoratorTest {

    public static void main(String[] args) {
        DecoratorHuman decoratorHuman = new DecoratorHuman(new Women());
        decoratorHuman.decorat();
    }
}
