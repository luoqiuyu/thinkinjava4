package chapter02;

/**
 * Created by luoqiuyu on 16/10/14.
 */
public class Storage {
    String s = "Hello, World!";
    int storage(String s){
        return  s.length()*2;
    }

    void  print(){
        System.out.println("storage(s) = "+storage(s));
    }

    public static void main(String[] args){
        Storage storage = new Storage();
        storage.print();
    }

}
