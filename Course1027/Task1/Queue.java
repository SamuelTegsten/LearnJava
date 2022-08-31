package Course1027.Task1;

import java.util.Arrays;

public class Queue {
    private String[] text;
    private static int i;
    private static int size;

    public Queue(int size){
        this.size = size;
        this.text = new String[size];
    }
    public Queue(){
        this.i = 10;
        this.text = new String[i];
    }

    public void size(){
        System.out.println(text);
    }

    public boolean isEmpty(){
        if(size == 0)
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
        resize();
    }

    public String dequeue(){

        String dequeued = text[0];
        for(int j = 0; j < size - 1; j++){
            text[j] = text[j + 1];
        }

        size--;
        i--;
        String[] oldQueue = text;
        text = new String[size];
        for(int j = 0; j < i; j++){
            text[j] = oldQueue[j];
        }
        return dequeued;
    }

    private void resize(){
        if(i == size){
            String[] oldQueue = text;
            size *= 2;
            text = new String[size];
            for(int j = 0; j < i; j++){
                text[j] = oldQueue[j];
            }
        }
    }

    public String peek(){
        return text[0];
    }

    public String getAll(){
        return Arrays.toString(text);
    }

    public String[] getText() {
        return text;
    }

    @Override
    public String toString() {
        return " Queue {" +
                Arrays.toString(text) + " " +
                "Size of the Queue: " + size + " " +
                '}';
    }
}
