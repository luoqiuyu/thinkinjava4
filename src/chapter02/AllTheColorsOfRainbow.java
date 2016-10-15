package chapter02;

/**
 * Created by luoqiuyu on 16/10/15.
 */
public class AllTheColorsOfRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args){
        AllTheColorsOfRainbow all = new AllTheColorsOfRainbow();
        all.changeTheHueOfTheColor(27);
    }
}
