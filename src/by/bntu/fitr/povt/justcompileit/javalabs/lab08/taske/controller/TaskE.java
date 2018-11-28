package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.util.UserInput;
import  by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.model.logic.Verifier;
import  by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.view.Printer;

public class TaskE {
    public static void main(String[] args) {
        int number = UserInput.inputInt("Input number of a number in Fibonachi's row: ");

        int answer = Verifier.findFibonacci(number);

        Printer.print(String.format("%d's Fibonachi number is %d", number, answer));
    }
}
