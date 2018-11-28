package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.model.logic.Verifier;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.view.Printer;

public class TaskB {

    public static void main(String[] args) {
        int number = UserInput.inputInt("Input natural number: ");
        int mul = UserInput.inputInt("Input multiplicity: ");

        String answer = Verifier.check(number, mul);

        Printer.print(answer);
    }
}
