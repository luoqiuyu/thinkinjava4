package chapter09;

import java.util.Arrays;

/**
 * Created by luoqiuyu on 16/12/6.
 * 策略设计模式
 */

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return  input;
    }
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString( ((String)input).split(" "));
    }
}

public class Apply {
    public static String s = "Disagreement with beliefs is by definition incrorret";

    public static void process(interfaces.Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }




}
