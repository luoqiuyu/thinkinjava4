package chapter09;

/**
 * Created by luoqiuyu on 16/12/6.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform " + id;
    }
}
