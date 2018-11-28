package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.model.logic;

public class Verifier {

    public static final int DEFAULT_VALUE = 0;
    public static final int BASE = 10;
    public static final int MIN_DIGITE = 0;
    public static final int MAX_DIGITE = 9;

    public static int countForDifDigits(int number) {
        int count = DEFAULT_VALUE;
        if (number > DEFAULT_VALUE) {
            for (int i = MIN_DIGITE; i <= MAX_DIGITE; i++) {
                int n = number;
                while (n > DEFAULT_VALUE) {
                    if (n % BASE == i) {
                        count++;
                        break;
                    }
                    n /= BASE;
                }
            }
        }
        return count;
    }
}
