import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{7,8,15},{1,1,1},{19,11,4},{3,10,10}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  //System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumCols(arr))));
  System.out.println(ArrayOps.isColMagic(arr));
  }
}
