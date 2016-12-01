package chapter08;

import chapter02.Incrementable;

/**
 * Created by luoqiuyu on 16/11/14.
 */
public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play()" + n);
    }
}
