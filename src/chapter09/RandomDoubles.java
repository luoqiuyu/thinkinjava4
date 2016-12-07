package chapter09;

import java.util.Random;

/**
 * Created by luoqiuyu on 16/12/7.
 */
public class RandomDoubles {
    public static Random random = new Random(47);
    public double next(){
        return random.nextDouble();
    }
    public static void main(String[] args){
        RandomDoubles randomDoubles = new RandomDoubles();
        for (int i = 0 ; i<10; i++){
            System.out.println(randomDoubles.next() + " ");
        }
    }
}
