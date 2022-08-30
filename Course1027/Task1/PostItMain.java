package Course1027.Task1;

public class PostItMain {
    public static void main(String[] args){
        PostIt p = new PostIt("Buy milk");
        p.addNote("Call the doctor");
        System.out.println(p.toString());
        PostIt q = new PostIt("Feed the cat");
        q.addNote("...and the dog");
        System.out.println(q.toString());
        PostIt r = new PostIt("Relax");
        r.addNote("Go to the cinema");
        System.out.println(r.toString());
    }
}
