import java.util.Scanner;

class Letter{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Print some text: ");
        String text = scn.nextLine();
        char[] letters = text.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] counts = new int[5];
        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < vowels.length; j++) {

                if (letters[i] == vowels[j]) {
                    counts[j]++;
                }
            }
        }
        for (int j = 0; j < vowels.length; j++) {
            System.out.println(vowels[j] + " " + counts[j]);
        }
    }
}