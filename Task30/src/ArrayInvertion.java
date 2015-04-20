import java.util.Arrays;

public class ArrayInvertion {
    private Integer [] digit;
    private Integer length;
    
    public ArrayInvertion(Integer[] digit) {
        this.digit = digit;
        this.length = digit.length;
    }

    public void invertArray(){
       Integer [] invert = new Integer[length];
        for(int x = 0;x < length;x++){
            invert[length -x -1] = digit[x];
        }
        System.out.println(Arrays.toString(invert));
    }

}
