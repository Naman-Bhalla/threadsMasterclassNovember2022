package org.example.threadedhelloworldrunnables;

public class Client {
    public static void main(String[] args) {
        Thread helloWorldPrinter = new Thread(new HelloWorldPrinter());
        // creating an object of thread class by passing the runnable to it
        helloWorldPrinter.start();

        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}


// Intellij Ultime Edition free for 6 months