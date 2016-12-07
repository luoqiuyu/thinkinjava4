package chapter09;

/**
 * Created by luoqiuyu on 16/12/7.
 */
interface Cycle{
    void cycle();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{

    @Override
    public void cycle() {
        System.out.println("Unicycle.cycle");
    }
}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{

    @Override
    public void cycle() {
        System.out.println("Bicycle.cycle");
    }
}
class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle{

    @Override
    public void cycle() {
        System.out.println("Tricycle.cycle");
    }
}
class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}


public class Cycles {
    public static void tryCycle(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        cycle.cycle();
    }

    public static void main(String[] args){
        tryCycle(new UnicycleFactory());
        tryCycle(new BicycleFactory());
        tryCycle(new TricycleFactory());
    }
}
