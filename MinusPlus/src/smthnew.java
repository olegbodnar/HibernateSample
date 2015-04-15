
public class smthnew {
    public static void main(String[] args) {


        double d[] = {3.1, 2.2, -6.2, 5.5, -1.4, -6.3};
        System.out.println("Before changes ");
        printMassive(d);

        double c[] = reverseMassive2(d);
        System.out.println("After changes ");
        printMassive(c);

    }
    public static void printMassive(double d[]) {
        for (int i = 0; i <= d.length - 1; i++) {
            System.out.println(d[i]);
        }


    }
    public static double[] reverseMassive2(double inputMassive[]) {
        int size = inputMassive.length;
        double[] resultMassive = new double[size];
        for (int i = size-1; i >=0; i--){
            resultMassive[i] = inputMassive[size-1-i];


        }

        return resultMassive;
    }



//    public static void createMassive(int x ) {
//        Integer[]element = new  Integer[x];
//        for (int i = 0; i<element.length;i++){
//            element[i] = element.length-i;
//            System.out.println(element[i]);
//        }
//    }
}
