package org.example.hundredprinter;

public class PrintNumber implements Runnable {
    private int numberToPrint;

    public PrintNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        if (numberToPrint == 50) {
            System.out.println("Break");
        }
        try {
            Thread.sleep(60);
        } catch (Exception e) {
            System.out.println("Do nothing");
        }

        System.out.println("Number is " + this.numberToPrint + ". Printed by: " + Thread.currentThread().getName());

    }
}
