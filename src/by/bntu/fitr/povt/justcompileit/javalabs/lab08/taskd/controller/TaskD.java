package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.model.logic.Verifier;

public class TaskD {
    public static void main(String[] args) {
        int number = UserInput.inputInt("Input number: ");

        int answer = Verifier.countForDifDigits(number);

        Printer.print(String.format("Amount of different digits in the number(0 if not a natural number): %d", answer));
    }
}
