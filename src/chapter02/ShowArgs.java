package chapter02;

/**
 * Created by luoqiuyu on 16/10/15.
 */
public class ShowArgs {
    public static void main(String[] args){
        if (args.length <3){
            System.out.println("args.length:" + args.length);
            System.err.println("Need three arguments");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
