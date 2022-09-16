import java.util.Random;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int [] hi = {1,4,7,3,5};
        int index = 2; 
        four(hi, index);
        

        
       
       
    
}

public static int four(int[] hi, int index)throws Exception {
    int x = 1;
    if(index > hi.length || index < 0){
        throw new Exception("Pimpomwedmopwemowpmowpedmwpedmwpedmwpedmwepdm");

    }
    for(int i = 0; i < index; i++){
         x *= hi[i];


    }
     {System.out.println((x % hi.length)-1);}
    return x;
}

}
