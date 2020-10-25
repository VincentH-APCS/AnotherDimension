import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{1},{3,3,3},{2,5}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  }
}
