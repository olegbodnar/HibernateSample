import java.util.Scanner;

class Letter{
    public static void main(String[] args) {
        Scanner scn   = new Scanner (System.in);
        System.out.println("Print some text: ");
        String text     = scn.nextLine();
        char[] letters  = text.toCharArray();
        char[] vowels = { 'a','e','i','o','u' };
        int [] counts   = new int[26];
        for ( int i=0; i<letters.length; i++ ){

            for( int j=0; j<vowels.length; j++ ){

                if( letters[i] == vowels[j] ){
                    counts[j]++;
                }
            }
        }
        for ( int j=0; j<vowels.length; j++){
            System.out.println( vowels[j] + " " + counts[j]);
        }
        int index = 0;
        for ( int i=1; i<26; i++){
            if (counts [index]< counts[i]){
                index = i;
            }
        }
        System.out.println("The letter with the greatest frequency is: "   + vowels[index]);
    }
}