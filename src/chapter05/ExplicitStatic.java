package chapter05;

/**
 * Created by luoqiuyu on 16/11/7.
 */
class Cup{
    Cup(int market){
        System.out.println("Cup("+market+")");
    }
    void f(int market){
        System.out.println("f("+market+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }

}

public class ExplicitStatic {
    public  static  void  main(String[] args){
        System.out.println("Inside main");
//        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();
}
