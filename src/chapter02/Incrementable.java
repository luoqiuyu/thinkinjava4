package chapter02;

/**
 * Created by luoqiuyu on 16/10/14.
 */
class StaticTest{
    static int i =47;
}

public class Incrementable {
    static void increment(){
        StaticTest.i++;
        System.out.println("i="+StaticTest.i);
    }

    public static void main(String[] args){
        Incrementable incrementable = new Incrementable();
        Incrementable.increment();
        incrementable.increment();
        increment();
    }

}
