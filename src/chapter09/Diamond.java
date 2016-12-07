package chapter09;

/**
 * Created by luoqiuyu on 16/12/7.
 */

interface BaseInterface{
    void f();
}

interface IntermediateInterface1 extends BaseInterface{
    void f();
}

interface IntermediateInterface2 extends BaseInterface{
    void f();
}

interface CombinedInterface extends IntermediateInterface1,IntermediateInterface2{
    void f();
}

class CombinedImpl implements CombinedInterface{

    @Override
    public void f() {
        System.out.println("CombinedImpl.f()");
    }
}

public class Diamond {
    public static void main(String[] args){
        new CombinedImpl().f();
    }
}
