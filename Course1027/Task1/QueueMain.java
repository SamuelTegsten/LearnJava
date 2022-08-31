package Course1027.Task1;

public class QueueMain {
    public static void main(String[] args){
        Queue q = new Queue(4);
        q.enqueue("Buy a textbook");
        q.enqueue("Follow the lectures");
        q.enqueue("Read the textbook");
        q.enqueue("Write code");
        q.enqueue("Override");
        System.out.println(q.toString());

        q.dequeue();
        q.dequeue();
        q.enqueue("Do it again");
        System.out.println(q.toString());

        String s = q.dequeue();
        System.out.println("Dequeued: " + s);

        String a = q.peek();
        System.out.println("Peeking: " + a);
        String list = q.getAll();
        System.out.println("Current Queue: " + list);

        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        System.out.println(q.toString());

    }
}
