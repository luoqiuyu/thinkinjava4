package chapter02;

/**
 * Created by luoqiuyu on 16/10/14.
 */
public class StaticTestAgain {
    static int i = 47;
    public static void main(String[] args){
        StaticTestAgain test1 = new StaticTestAgain();
        StaticTestAgain test2 = new StaticTestAgain();
        System.out.println(test1.i + "==" + test2.i);
        test1.i++;
        System.out.println(test1.i + "==" + test2.i);
    }
}
