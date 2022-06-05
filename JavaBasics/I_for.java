package LearnJava.JavaBasics;

public class I_for {
    public static void main(String[] args){
        int array[] = {10,5,3,1,24,12};
        int len = array.length;
        int temp;

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i < len; i++)
        {
            System.out.println(array[i]);
        }
    }
}
