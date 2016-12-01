package chapter08;

/**
 * Created by luoqiuyu on 16/11/18.
 */

class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){
        System.out.println("Creating" + this);
        System.out.println("counter="+counter);
    }
    public void addRef(){
        refcount++;
        System.out.println("counter="+counter);
        System.out.println("refcount"+refcount);
        System.out.println("Shared id ="+id);
    }
    protected void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing" + this);
        }
    }

    public String toString(){
        return "Shared" + id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Creating" + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("dispose"+this);
        shared.dispose();
    }
    public String toString(){
        return "Composing" + id;
    }

}

public class ReferenceCounting {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)
        };
        for (Composing c:composings){
            c.dispose();
        }
    }
}
