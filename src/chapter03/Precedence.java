package chapter03;

/**
 * Created by luoqiuyu on 16/10/15.
 */
public class Precedence {
    public static void main(String[] args){
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a + " b = " + b);
    }
}
