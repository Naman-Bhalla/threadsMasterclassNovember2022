package org.example.threadedhelloworld;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.start();

        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}


// Intellij Ultime Edition free for 6 months