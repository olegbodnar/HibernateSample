import java.util.Scanner;
import java.io.*;


class Tets{
    public static void main(String[] args) throws IOException{
        Scanner scn = new Scanner(System.in);
//       double p = 3.14d;
       double p = Math.PI;
        double square;
        System.out.println("Calculate the radius");
        System.out.println("Enter the Radius");
        double rad = scn.nextInt();
        square = p * rad * rad;
        System.out.println("The square is "+ square);
    }
}