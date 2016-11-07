package chapter05;

/**
 * Created by luoqiuyu on 16/11/7.
 */
public class EnumOrder {
    public static void main(String[] args){
        for (Spiciness s:Spiciness.values()){
            System.out.println(s + ",ordinal " + s.ordinal());
        }
    }
}
