
public class PlusMinus {
    public static void main(String[] args) {
        int i;
        //int size = 6;
        double z;
        double d[] = {3.1, 2.2, -6.2, 5.5, -1.4, -6.3};


        System.out.println("Before changes");
        for (i = 0; i <= d.length - 1; i++)
            System.out.println("element [" + i + "] is " + d[(i)]);

        double another[] = new double[d.length];
//        another [0] = d[5];
//        another [1] = d[4];
//        another [2] = d[3];
//        another [3] = d[2];
//        another [4] = d[1];
//        another [5] = d[0];
        for (i = d.length; i > another.length - 1; i--) ;

        System.out.println(another[i]);

//    public void outMassive() {



}
}


        //for (int a = 1;a<size;a++)
          //  for (int b = size -1; b>= a;b--){
            //    if (d[b-1]> d[b]){
              //      z = d[(b-1)];
                //    d[((b - 1))] = d[(b)];
                  //  d[(b)] = z;
            //   }
           // }
        //System.out.println("After changes ");

       // for(i = 0; i<size;i++)
         //   System.out.println("element ["+i+"] is "+ d[(i)]);


