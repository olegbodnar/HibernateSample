import java.util.Scanner;

public class MtoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a [] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.floor(Math.random() * 9);
            System.out.println(a);

        }


    }
}