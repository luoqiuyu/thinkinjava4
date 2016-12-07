package chapter09;

/**
 * Created by luoqiuyu on 16/12/6.
 */
public abstract class StringProcessor extends Processor {
    public abstract String process(Object input);

    public String name(){
        return  getClass().getSimpleName();
    }

    public static String s = "Disagreement with beliefs is by definition incrorret";

    public static void main(String[] args){
//        Apply.process(new StringDowncase(),s);
//        Apply.process(new StringUpcase(),s);

    }

}

class StringUpcase extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class StringDowncase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}