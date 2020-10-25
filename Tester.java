import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{0,41,0},{22,22,22,22},{86,55},{0,0,4}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  }
}
