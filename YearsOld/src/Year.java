import java.util.*;
import java.io.IOException;

public class Year {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello enter please your age and I will say what age category you are)) ");
        Integer numb;
        numb = scn.nextInt();
        int y = 25;
        int ma = 40;
        int old = 55;
        //int pens = 65;

        if (numb <= y)
            System.out.println("Tou are young man congratulations");
        else if (numb <= ma) {
            System.out.println("you are i middle ages");
        } else if (numb <= old) {
            System.out.println("you are old");
        } else System.out.println("You are on pension");

    }
}