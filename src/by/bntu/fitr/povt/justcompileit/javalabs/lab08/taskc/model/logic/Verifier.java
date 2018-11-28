package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.model.logic;

public class Verifier {

    public static final int DEFAULT_VALUE = 0;
    public static final int BASE = 10;

    public static String checkForPalindrome(long number) {
        String answer = "Incorrect data.";

        if (number > DEFAULT_VALUE) {
            long n = number;
            long rev = DEFAULT_VALUE;
            long dig = DEFAULT_VALUE;
            while (n > DEFAULT_VALUE) {
                dig = n % BASE;
                rev = rev * BASE + dig;
                n /= BASE;
            }
            if (number == rev) {
                answer = "Number is palindrome.";
            } else {
                answer = "Number isn't palindrome.";
            }
        }
        return answer;
    }
}
