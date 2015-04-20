
public class ArrayManager {
    private Integer[] digits;
    private Integer length;

    public ArrayManager(Integer[] digits) {
        this.digits = digits;
        this.length = digits.length;
    }

    public void massiveAvg() {
        Integer sum = 0;
        Integer sum2 = 0;
        for (Integer digit : digits) {
            sum = sum + digit;
            sum2 = sum / length;
        }
        System.out.println(sum2);
    }
}
