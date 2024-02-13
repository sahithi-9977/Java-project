package threads;
    public class OddEvenPrinter {
        public static void main(String[] args) {
            // Creating two threads, one for printing even numbers and the other for printing odd numbers
            Thread evenThread = new Thread(new EvenPrinter());
            Thread oddThread = new Thread(new OddPrinter());

            // Starting both threads
            evenThread.start();
            oddThread.start();
        }
    }

    // Runnable class for printing even numbers
    class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    // Sleep for a short duration to simulate some processing time
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Runnable class for printing odd numbers
    class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 59; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    // Sleep for a short duration to simulate some processing time
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
