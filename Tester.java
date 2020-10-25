import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{4,12,5},{7,7,7},{123,0,14},{3,2,1}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  //System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  System.out.println(Arrays.toString((ArrayOps.sumCols(arr))));
  }
}
