package com.guess_the_number;

public class Model {
    private int randomNumber;
    private int max_number = 100;
    private int min_number = 0;

    void generateNumber(int min, int max) {
        randomNumber = rand(min, max);
    }

    public int rand (int min, int max) {
        return (int)(Math.random() * (max-min-1)+min+1);
    }
    String getRange() {
        return "(" +min_number+ "," +max_number+")" ;
    }

    boolean checkNumber(int number) {
        if (number == randomNumber) {
            return true;
        } else {
            if (number > randomNumber) {
                max_number = number;
            } else {
                    min_number = number;
                }
                return false;
            }
    }

    boolean analyzeNum(int num) {
        return randomNumber< num;
    }

    boolean IsNumInRange (int num) {
        return (num> min_number) && (num< max_number);
    }

    public int getMax_number() {
        return max_number;
    }
    public void setMax_number() {
        this.max_number= max_number;
    }

    public int getMin_number() {
        return min_number;
    }
    public void setMin_number() {
        this.min_number= max_number;
    }

}
