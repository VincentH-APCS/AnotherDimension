import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{5},{6,6,3,12},{5000,3,333}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  }
}
