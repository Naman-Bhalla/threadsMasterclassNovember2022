package org.example.hundredprinterexecutors;

public class PrintNumber implements Runnable {
    private int numberToPrint;

    public PrintNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {

        if (numberToPrint == 50) {
            System.out.println("Stop");
        }

        System.out.println("Number is " + this.numberToPrint + ". Printed by: " + Thread.currentThread().getName());

    }
}
