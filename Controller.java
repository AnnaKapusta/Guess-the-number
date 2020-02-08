package com.guess_the_number;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void UserProcess() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.INPUT_HELLO);
        model.generateNumber(model.getMax_number(), model.getMin_number());
        play(scanner);
        view.printMessage(View.INPUT_CORRECT_NUMBER);
        scanner.close();
    }

    void play(Scanner scanner) {
        int num;
        while (true) {
            num = InputNumber(scanner);
            if (model.checkNumber(num))
                return;
            if (model.analyzeNum(num)) {
                view.printMessage(view.INPUT_LOWER);
            } else {
                view.printMessage(view.INPUT_HIGHER);
            }
        }
    }

    int InputNumber(Scanner scanner) {
        view.ConnectAndPrint(View.INPUT_YOUR_NUMBER, model.getRange());
        int num;
        while (true) {
        num = inputInt(scanner);
        if (model.IsNumInRange(num)) {
            return num;
        } else {
             return 0;
            }
        }
    }

        int inputInt (Scanner scanner){
            while (!scanner.hasNextInt()) {
                view.printMessage(View.INPUT_WRONG);
                scanner.next();
            }
            return scanner.nextInt();
        }

}



