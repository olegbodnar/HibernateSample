import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer i ;

        Integer salary [] = new Integer[6];
        for (i = 2000; i <= salary.length;i++);
        

        System.out.println("Jan");
        salary[0] = scn.nextInt();
        System.out.println("Feb");
        salary[1]= scn.nextInt();
        System.out.println("Mar");
        salary[2] = scn.nextInt();
        System.out.println("Apr");
        salary[3] = scn.nextInt();
        System.out.println("Jun");
        salary[4] = scn.nextInt();
        System.out.println("Jul");
        salary[5] = scn.nextInt();

        Integer conter = salary[0]+salary[1]+salary[2]+salary[3]+salary[4]+salary[5];
        System.out.println("The total salary is "+ conter);

    }

}
