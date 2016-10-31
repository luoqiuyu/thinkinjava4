package chapter03;

/**
 * Created by luoqiuyu on 16/10/15.
 */
class Integral{
    float f;
}

public class Aliasing {
    public static void main(String[] args){
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 9f;
        n2.f = 47f;
        System.out.println("1: n1.f " + n1.f + ", n2.f " + n2.f);

        n1 = n2;
        System.out.println("2: n1.f " + n1.f + ", n2.f " + n2.f);

        n1.f = 27f;
        System.out.println("3: n1.f " + n1.f + ", n2.f " + n2.f);

    }
}
