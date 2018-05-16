package decorator;

/**
 * Created by myijoes on 2018/5/14.
 */
public class DecoratorHuman implements Human {

    private Human human;

    public DecoratorHuman(Human human) {
        this.human = human;
    }

    @Override
    public void decorat() {
        human.decorat();
        System.out.println("###### 穿高跟鞋");
    }
}
