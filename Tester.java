import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{9,7,6},{12,1,5},{19,12,4},{-10,10,15}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  //System.out.println(Arrays.toString((ArrayOps.largestInRows(arr))));
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(Arrays.toString((ArrayOps.sumCols(arr))));
  System.out.println(ArrayOps.isColMagic(arr));
  }
}
