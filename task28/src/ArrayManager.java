
public class ArrayManager {
    private Integer [] mass;
    public ArrayManager(Integer[] mass) {
        this.mass = mass;
    }
    public void massive1() {
    Integer sum = 0;
        for(Integer array : mass) {

            sum = sum + array;
        }
        System.out.println(sum);
    }
}
