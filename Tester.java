import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{-6,-7,-8,-1},{-5,-4,-2},{-13}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  }
}
