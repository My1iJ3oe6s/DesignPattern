package adapter;


/**
 * Created by myijoes on 2018/5/7.
 * <p>
 * 设计模式-适配器模式<br/>
 * <p>
 *
 * 优点:
 * 1、将目标类和适配者类解耦
 * 2、增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，而且提高了适配者的复用性
 * 3、灵活性和扩展性都非常好，符合开闭原则
 *
 * 原理:
 * 1.目标类
 * 2.适配类
 * 3.适配器(实现目标类的接口,含有适配类的引用)
 *
 */
public class AdapterTest {

   public static void main(String[] args) {

      Big big = new SmallToBigAdapter(new Small() {
         @Override
         public void userSmallPort() {
            System.out.println("###### small interface");
         }
      });

      big.userBigPort();

   }


}
