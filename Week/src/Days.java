import java.util.*;
import java.io.*;


public class Days {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        String day [] = new String []{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Integer nubmerOfDay = scn.nextInt();
        if (nubmerOfDay < day.length){
            System.out.println(day [nubmerOfDay-1
                    ]);
        } else {
            System.out.println("Number should be less than 7");
        }
    }
}

