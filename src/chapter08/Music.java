package chapter08;

/**
 * Created by luoqiuyu on 16/11/14.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.B_FLAT);
    }

    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);

        Instrument instrument = new Wind();
        tune(instrument);

    }
}
