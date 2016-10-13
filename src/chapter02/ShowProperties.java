package chapter02;

/**
 * Created by luoqiuyu on 16/10/13.
 */
public class ShowProperties {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

    }
}
