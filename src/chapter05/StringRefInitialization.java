package chapter05;

/**
 * Created by luoqiuyu on 16/10/31.
 */
public class StringRefInitialization {
    String s1 = "Initialzed at definiition";
    String s2;
    public  StringRefInitialization(String s2i){
        s2 = s2i;
    }

    public static void main(String args[]){
        StringRefInitialization stringRefInitialization = new StringRefInitialization("Initialized at Construction");
        System.out.println("sri.s1 = "+ stringRefInitialization.s1);
        System.out.println("sri.s2 = "+ stringRefInitialization.s2);
    }
}
