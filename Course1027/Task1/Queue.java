package Course1027.Task1;

public class Queue {
    private String[] text;
    private static int i;

    public Queue(int size){
        this.text = new String[size];
        resize(size);
    }
    public Queue(){
        this.text = new String[10];
    }

    public void size(){
        System.out.println(text);
    }

    public boolean isEmpty(){
        if(text.length == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(String input){
        text[i] = input;
        i++;
    }

    private void resize(int size){
        if(this.i == size){
            text = new String[size * 2];
        }
    }

}
