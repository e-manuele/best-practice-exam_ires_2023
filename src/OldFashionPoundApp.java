package src;

import java.lang.reflect.Method;
import java.util.HashMap;

public class OldFashionPoundApp {

    /*
   1p = 240d
   1s = 12d
   */
    /*
For example "12p 6s 10d" is 12 Pounds, 6 Shillings and 10 Pence.

Example SUM:
5p 17s 8d + 3p 4s 10d = 9p 2s 6d
Example SUBTRACTION:
5p 17s 8d - 3p 4s 10d = 2p 12s 10d
Subtractions giving negative results are managed:
5p 17s 8d - 5p 18s 8d = 0d (-1s 0d)

Example MULTIPLICATION:

5p 17s 8d * 2 = 11p 15s 4d
Example DIVISION:
5p 17s 8d / 3 = 1p 19s 2d (2p)
Another Example DIVISION
18p 16s 1d / 15 = 1p 5s 0d (1s 1d)
     */
    public static void main(String[] args) {

        Pound p1 = new Pound(5, 17, 8);
        Pound p2 = new Pound(3, 4, 10);
        Pound p3 = new Pound(5, 18, 8);
        Pound p4 = new Pound(18, 16, 1);

        PoundConverter conv = new PoundConverter();

        PoundOperation op = new PoundOperation(conv);
//        HashMap<String, String>

        System.out.print("Example SUM:\n" +
                "5p 17s 8d + 3p 4s 10d = 9p 2s 6d \n" +
                "op.sum(p1,p2) -> ");
        System.out.println(op.sum(p1, p2));
        System.out.println();
        System.out.print("Example SUBTRACTION:\n" +
                "5p 17s 8d - 3p 4s 10d = 2p 12s 10d \n" +
                "op.subtraction(p1,p2) -> ");
        System.out.println();
        System.out.println(op.subtraction(p1, p2));
        System.out.print("Subtractions giving negative results are managed:\n" +
                "5p 17s 8d - 5p 18s 8d = 0d (-1s 0d) \n" +
                "op.subtraction(p1,p3) -> ");
        System.out.println(op.subtraction(p1, p3));
        System.out.println();

        System.out.print("Example MULTIPLICATION:\n" +
                "5p 17s 8d * 2 = 11p 15s 4d \n" +
                "op.subtraction(p1,p3) -> ");
        System.out.println(op.multiplication(p1, 2));
        System.out.println();
        System.out.print("Example DIVISION:\n" +
                "5p 17s 8d / 3 = 1p 19s 2d (2p)\n" +
                "op.division(p1,3) -> ");
        System.out.println(op.division(p1, 3));
        System.out.println();
        System.out.print("Another Example DIVISION\n" +
                "18p 16s 1d / 15 = 1p 5s 0d (1s 1d) \n" +
                "op.division(p4,15) -> ");
        System.out.println(op.division(p4, 15));
        System.out.println();

    }


}