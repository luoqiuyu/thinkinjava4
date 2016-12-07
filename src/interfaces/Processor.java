package interfaces;

/**
 * Created by luoqiuyu on 16/12/6.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
