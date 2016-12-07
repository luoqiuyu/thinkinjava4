package chapter09;

/**
 * Created by luoqiuyu on 16/12/6.
 */

public class FilterProcessor{
    public static void main(String[] args){
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
    }
}

class FilterAdapter implements interfaces.Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
