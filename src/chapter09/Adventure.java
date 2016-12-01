package chapter09;

/**
 * Created by luoqiuyu on 16/12/1.
 * 9.4 Java多重继承
 * 使用接口的原因：
 * 1.能够向上转型为多个基类型
 * 2.与使用抽象基类相同，防止创建该类的对象
 */

interface CanFight{
    void fight();
}

interface CanSwim{
    void Swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){
        System.out.println("ActionCharater.fight");
    }
}

class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim{

    @Override
    public void Swim() {
        System.out.println("Hero swim");
    }

    @Override
    public void fly() {
        System.out.println("Hero fly");
    }
}

public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }

    public static void u(CanSwim x){
        x.Swim();
    }

    public static void v(CanFly x){
        x.fly();
    }

    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args){
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
