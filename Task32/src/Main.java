
public class Main {

//    public static void main(String[] args) {
//        Integer number = 2015;
//
//        aRR aRR = new aRR(number);
//        aRR.getDigits();
public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    int result = 0;

    for (int i =arr.length -1 , f = 0; i >= 0; --i, f++) {
        int pos = (int)Math.pow(10, i);
        result += arr[f] * pos;
    }
    System.out.println(result);
}
    int i = 0;
    while (num > 0)
    {
        digits[i++] = num % 10;
        num /= 10;
    }



}
