package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model.logic.Counter;

public class TaskA {

    public static void main(String[] args) {
        long number = UserInput.inputInt("Input any natural number: ");

        int amount = Counter.count(number);

        Printer.print(String.format("Amount of digits in natural number(0 if not natural): %d", amount));

    }
}
