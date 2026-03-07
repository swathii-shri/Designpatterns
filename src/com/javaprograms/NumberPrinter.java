package com.javaprograms;

/**
 * Program to print odd and even numbers from two arrays using multiple threads
 * in sequence (alternating between odd and even).
 */
public class NumberPrinter {

    private static final int[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15};
    private static final int[] evenNumbers = {2, 4, 6, 8, 10, 12, 14, 16};

    // Shared object for synchronization
    private static final Object lock = new Object();

    // Flag to track whose turn it is: true for odd, false for even
    private static boolean oddTurn = true;

    // Counters for tracking position in each array
    private static int oddIndex = 0;
    private static int evenIndex = 0;

    /**
     * Thread class to print odd numbers
     */
    static class OddNumberThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                while (oddIndex < oddNumbers.length) {
                    // Wait if it's not odd's turn
                    while (!oddTurn && oddIndex < oddNumbers.length) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }

                    // Print the odd number if available
                    if (oddIndex < oddNumbers.length) {
                        System.out.println("Odd Thread: " + oddNumbers[oddIndex++]);
                        oddTurn = false;  // Switch turn to even thread
                        lock.notifyAll();  // Wake up even thread
                    }
                }
            }
        }
    }

    /**
     * Thread class to print even numbers
     */
    static class EvenNumberThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                while (evenIndex < evenNumbers.length) {
                    // Wait if it's not even's turn
                    while (oddTurn && evenIndex < evenNumbers.length) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }

                    // Print the even number if available
                    if (evenIndex < evenNumbers.length) {
                        System.out.println("Even Thread: " + evenNumbers[evenIndex++]);
                        oddTurn = true;  // Switch turn to odd thread
                        lock.notifyAll();  // Wake up odd thread
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Multi-threaded Number Printer ===");
        System.out.println("Printing odd and even numbers in sequence...\n");

        // Create threads
        Thread oddThread = new OddNumberThread();
        Thread evenThread = new EvenNumberThread();

        // Start both threads
        oddThread.start();
        evenThread.start();

        // Wait for both threads to complete
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Main thread interrupted!");
        }

        System.out.println("\n=== Printing Complete ===");
    }
}


