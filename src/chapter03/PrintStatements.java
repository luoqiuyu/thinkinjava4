package chapter03;

import java.util.Date;

import static com.sun.deploy.trace.Trace.print;


/**
 * Created by luoqiuyu on 16/10/15.
 */
public class PrintStatements {
    public static void main(String[] args){
        Date currentDate = new Date();
        System.out.println("Hello,it's: " + currentDate);
        print("Hello,it's: " + currentDate);
    }
}
