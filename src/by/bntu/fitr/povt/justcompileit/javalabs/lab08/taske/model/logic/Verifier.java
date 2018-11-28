package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.model.logic;

public class Verifier {

    public static final int DEFAULT_VALUE = 0;
    public static final int FIRST_ELEMENT = 1;
    public static final int BASE = 10;

    public static int findFibonacci(int number) {
        int nf = DEFAULT_VALUE; // next number in the row
        int pf = DEFAULT_VALUE; // previous number in the row
        int buf = DEFAULT_VALUE; // buffer
        // calculating number with index = number
        if (number > DEFAULT_VALUE) {
            nf = FIRST_ELEMENT;
            for (int i = FIRST_ELEMENT; i < number; i++) {
                buf = nf + pf;
                pf = nf;
                nf = buf;
            }
        }
        return nf;
    }
}
