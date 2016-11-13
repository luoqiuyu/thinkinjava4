package chapter07;

/**
 * Created by luoqiuyu on 16/11/13.
 */

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverridePrivate extends WithFinals{

    private final void f(){
        System.out.println("OverridePrivate.f()");
    }


    private void g(){
        System.out.println("OverridePrivate.g()");
    }

}

class OverridePrivare2 extends OverridePrivate{
    public final void f(){
        System.out.println("OverridePrivate2.f()");
    }

    public void g(){
        System.out.println("OverridePrivate2.g()");
    }

}

public class FinalOverridingIllusion {
    public static void main(String[] args){
        OverridePrivare2 op2 = new OverridePrivare2();
        op2.f();
        op2.g();

        OverridePrivate op = op2;

        WithFinals wf = op2;
//        wf.f();


    }



}
