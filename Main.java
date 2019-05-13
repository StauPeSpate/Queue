public class Main {
    public static void main(String[] args)
    {
        Queue<Integer> ADTQ = new Queue<Integer>();
        ADTQ.enqueue(3);
        ADTQ.enqueue(5);
        ADTQ.enqueue(14);
        ADTQ.enqueue(11);
        ADTQ.dequeue(3);

        ADTQ.display(); // Prints the Queue;
        System.out.println(ADTQ.isEmpty()); //Prints whether if the Queue is empty or not
        System.out.println(ADTQ.peek()); // Prints the first element of the Queue;
    }
}
