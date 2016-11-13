package chapter07;

/**
 * Created by luoqiuyu on 16/11/12.
 */
class Gizmo{
    public void spin(){}
}

public class FinalArguments {
    void with(final Gizmo g){

    }
    void withoutFinal(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args){
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.with(null);
    }
}
