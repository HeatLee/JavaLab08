package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.model.logic;

public class Verifier {

    public static final int DEFAULT_VALUE = 0;
    public static final int BASE = 10;
    //public static final int MULTIPLICITY = 2;

    public static String check(int number, int mul) {
        String answer = "Incorrect data.";

        if (number > DEFAULT_VALUE) {
            long dig = DEFAULT_VALUE;
            int counter = DEFAULT_VALUE;
            int numLen = DEFAULT_VALUE;
            while (number > DEFAULT_VALUE) {
                dig = number % BASE;
                if (dig % mul == DEFAULT_VALUE) {
                    counter ++;
                }
                numLen ++;
                number /= BASE;
            }

            if (numLen == counter || counter == DEFAULT_VALUE) {
                answer = String.format("All digits in a number are divided by %d", mul);
            } else {
                answer = String.format("All digits in a number aren't divided by %d", mul);
            }
        }

        return answer;
    }
}
