package chapter07;

/**
 * Created by luoqiuyu on 16/11/12.
 */
class SelfCounter{
    private static  int count;
    private int id = count++;
    public String toString(){
        return  "SelfCounter" + id;
    }
}

class WithFinalFields{
    final SelfCounter selfCounter = new SelfCounter();
    static final SelfCounter sselfCounter = new SelfCounter();
    public String toString(){
        return  "scf = " + selfCounter + "\nsselfCounter" + sselfCounter;
    }
}

public class FinalFields {
    public static void main(String[] args){
        System.out.println("First Object");
        System.out.println(new WithFinalFields());
        System.out.println("Seconds Object");
        System.out.println(new WithFinalFields());
    }
}
