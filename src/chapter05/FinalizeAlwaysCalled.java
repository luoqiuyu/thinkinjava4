package chapter05;

/**
 * Created by luoqiuyu on 16/11/3.
 */
public class FinalizeAlwaysCalled {
    protected  void  finalize(){
        System.out.println("finalize() called");
    }

    public static void main(String[] args){
        new FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }

}
