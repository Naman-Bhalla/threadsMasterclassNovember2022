package org.example.hundredprinter;

public class Client {

    public static void main(String[] args) {
        // Print 1 to 100 each from separate thread
        for (int i = 1; i <= 100; ++i) {
            Thread thread = new Thread((new PrintNumber(i)));
            thread.start();
        }
    }
}
