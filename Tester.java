import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{1,2,3},{3,2,1},{2,2,2},{2,2,2}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  //System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumCols(arr))));
  System.out.println(ArrayOps.isColMagic(arr));
  }
}
