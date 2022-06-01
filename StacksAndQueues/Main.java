
class Main {

    public static void alternationSequence(int size) {
        CAQueue queue = new CAQueue(size);

        long startTime = System.nanoTime();

        for(int i = 0; i < size; i++) {
            queue.enqueue(i);
            queue.dequeue();
        }

        long endTime = System.nanoTime();
        double totalTime = (double)(endTime - startTime) / 100000;
        System.out.printf("%d, %.2f ms\n", size, totalTime);
    }

    public static void main(String[] args) {
        alternationSequence(20);
        alternationSequence(50);
        alternationSequence(100);
        alternationSequence(1000);
        alternationSequence(10000);
        alternationSequence(100000);
        alternationSequence(100000000);
    }
}