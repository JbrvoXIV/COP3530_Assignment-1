
class Main {

    public static void alternationSequenceCAQueue(int n) {
        CAQueue queue = new CAQueue(n * 2);

        long startTime = System.nanoTime(); // step 1

        for(int i = 0; i < n; i++) { //  step 2
            queue.enqueue(i);
        }

        for(int i = 0; i < n; i++) { // step 3
            queue.enqueue(i + n);
            queue.dequeue();
        }

        long endTime = System.nanoTime(); // step 4
        long totalTime = endTime - startTime; // step 5
        System.out.printf("%d, %d nanoseconds\n", n, totalTime); // step 6
    }

    public static void alternationSequenceSSQueue(int n) {
        SSQueue queue = new SSQueue(n * 2);

        long startTime = System.nanoTime(); // step 1

        for(int i = 0; i < n; i++) { //  step 2
            queue.enqueue(i);
        }

        for(int i = 0; i < n; i++) { // step 3
            queue.enqueue(i + n);
            queue.dequeue();
        }

        long endTime = System.nanoTime(); // step 4
        long totalTime = endTime - startTime; // step 5
        System.out.printf("%d, %d nanoseconds\n", n, totalTime); // step 6
    }

    public static void randomSequenceCAQueue(int n) {
        CAQueue queue = new CAQueue(n * 2);

        long startTime = System.nanoTime(); // step 1

        for(int i = 0; i < n; i++) { //  step 2
            queue.enqueue(i);
        }

        for(int i = 0; i < n; i++) { // step 3
            if(Math.random() < 0.5) {
                queue.enqueue(i + n);
            } else {
                queue.dequeue();
            }
        }

        long endTime = System.nanoTime(); // step 4
        long totalTime = endTime - startTime; // step 5
        System.out.printf("%d, %d nanoseconds\n", n, totalTime); // step 6
    }

    public static void randomSequenceSSQueue(int n) {
        SSQueue queue = new SSQueue(n * 2);

        long startTime = System.nanoTime();

        for(int i = 0; i < n; i++) { //  step 2
            queue.enqueue(i);
        }

        for(int i = 0; i < n; i++) { // step 3
            if(Math.random() < 0.5) {
                queue.enqueue(i + n);
            } else {
                queue.dequeue();
            }
        }

        long endTime = System.nanoTime(); // step 4
        long totalTime = endTime - startTime; // step 5
        System.out.printf("%d, %d nanoseconds\n", n, totalTime); // step 6
    }

    public static void main(String[] args) {
        System.out.printf("\nAlternating Sequence of CAQueue\n");
        alternationSequenceCAQueue(20);
        alternationSequenceCAQueue(50);
        alternationSequenceCAQueue(100);
        alternationSequenceCAQueue(1000);
        alternationSequenceCAQueue(10000);
        alternationSequenceCAQueue(100000);
        alternationSequenceCAQueue(100000000);

        System.out.printf("\nAlternating Sequence of SSQueue\n");
        alternationSequenceSSQueue(20);
        alternationSequenceSSQueue(50);
        alternationSequenceSSQueue(100);
        alternationSequenceSSQueue(1000);
        alternationSequenceSSQueue(10000);
        alternationSequenceSSQueue(100000);
        alternationSequenceSSQueue(100000000);

        System.out.printf("\nRandom Sequence of CAQueue\n");
        randomSequenceCAQueue(20);
        randomSequenceCAQueue(50);
        randomSequenceCAQueue(100);
        randomSequenceCAQueue(1000);
        randomSequenceCAQueue(10000);
        randomSequenceCAQueue(100000);
        randomSequenceCAQueue(100000000);

        System.out.printf("\nRandom Sequence of SSQueue\n");
        randomSequenceSSQueue(20);
        randomSequenceSSQueue(50);
        randomSequenceSSQueue(100);
        randomSequenceSSQueue(1000);
        randomSequenceSSQueue(10000);
        randomSequenceSSQueue(100000);
        randomSequenceSSQueue(100000000);
    }
}