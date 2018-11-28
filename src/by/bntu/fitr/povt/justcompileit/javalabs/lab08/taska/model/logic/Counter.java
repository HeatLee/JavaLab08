package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model.logic;

public class Counter {

    public static final int DEFAULT_VALUE = 0;
    public static final int BASE = 10;

    public static int count(long x){
        int i = DEFAULT_VALUE;
        if (x > DEFAULT_VALUE) {
            while (x > DEFAULT_VALUE) {
                x /= BASE;
                ++i;
            }
        }
        return i;
    }
}
