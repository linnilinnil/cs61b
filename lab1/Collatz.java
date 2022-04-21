/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n == 1)
        {
          return -1;
        }
        if (n % 2 == 0)
        {
          n = n/2;
        }
        else
        {
          n = 3*n + 1;
        }
        return n;
    }
    public static void main(String[] args) {
      int start = 5;
      while (start != 1){
          System.out.print(start + " ");
          start = nextNumber(start);
      }
      System.out.print(start);

    }
}
