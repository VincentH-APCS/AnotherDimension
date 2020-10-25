import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
  int[][] arr = {{4,12,6},{7,6,5,66},{0,-1,0},{5,5,23}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  //System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumCols(arr))));
  //System.out.println(ArrayOps.isColMagic(arr));
  System.out.println(ArrayOps.isLocationMagic(arr, 1, 2));
  }
}
