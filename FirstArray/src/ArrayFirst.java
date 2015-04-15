import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int element[] = new int[5];
        int i;


        System.out.println("the first element is ");
        element[0] = scn.nextInt();
        System.out.println("the second element is ");
        element[1] = scn.nextInt();
        System.out.println("the third element is ");
        element[2] = scn.nextInt();
        System.out.println("the fourth element is ");
        element[3] = scn.nextInt();
        System.out.println("the fifth element is ");
        element[4] = scn.nextInt();
        //for (i = 0; i < element.length;i++);
        //System.out.println("element ["+i+"]=");
        for(i = 0;i<= element.length -1;i++) {

            System.out.println("Element["+i+"] is  "+ element[i] );
        }

    }
}
