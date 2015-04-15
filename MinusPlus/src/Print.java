/**
 * Created by Oleg on 27.03.2015.
 */
public class Print {

    public static void main(String[] args) {
        printName("Rostyslav", "Chaban");

        printName("Petro", "Some");

    }

    public static void printName(String firstName, String secondName){
        System.out.println(firstName+ ", " + secondName);
    }
}
