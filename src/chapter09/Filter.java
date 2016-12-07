package chapter09;

/**
 * Created by luoqiuyu on 16/12/6.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    Waveform process(Waveform input){
        return  input;
    }
}
