package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.view.Printer;
import  by.bntu.fitr.povt.justcompileit.javalabs.lab08.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.model.logic.Verifier;

public class TaskC {
    public static void main(String[] args) {
        long number = UserInput.inputInt("Input integer number: ");

        String answer  = Verifier.checkForPalindrome(number);

        Printer.print(answer);
    }
}
