import java.util.*;
import java.io.*;

public class Numb2 {
    public static void main(String[] args)throws IOException{
        Scanner scn = new Scanner(System.in);
        int a ;
        int b ;
        int o;
        System.out.println("Enter please the first number");
        a = scn.nextInt();
        System.out.println("Enter please the second number");
        b = scn.nextInt();
        for (o = a;o<=b;o++){
            if(o%7 == 0 && o%3 != 0){
                System.out.println(o);
            }
        }
    }
}

