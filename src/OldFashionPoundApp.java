package src;

public class OldFashionPoundApp {

  /*
 1p = 20s
 1p = 240d
 1s = 12d
 */
    /*
For example "12p 6s 10d" is 12 Pounds, 6 Shillings and 10 Pence.

Sum and Subtraction should add or subtract two prices respectively.

Example SUM:

5p 17s 8d + 3p 4s 10d = 9p 2s 6d
Example SUBTRACTION:

5p 17s 8d - 3p 4s 10d = 2p 12s 10d
Subtractions giving negative results are managed:

5p 17s 8d - 5p 18s 8d = 0d (-1s 0d)
Multiplication and division will multiply or divide a price by an integer

Example MULTIPLICATION:

5p 17s 8d * 2 = 11p 15s 4d
Example DIVISION:

5p 17s 8d / 3 = 1p 19s 2d (2p)
Another Example DIVISION

18p 16s 1d / 15 = 1p 5s 0d (1s 1d)
     */
  public static void main(String[] args) {
//        # 18p 16s 1d / 15 = 1p 5s 0d (1s 1d)
    OldFashionPound dividendo = new OldFashionPound(18 ,16,1);
    int a = (18*240)+(16*12)+1;
    int b = a/15;
    int p = b/240;
    int s =( b -(p*240))/12;
    System.out.println(b);
    System.out.println(p +" p");
    System.out.println(s+" s");
  }
}