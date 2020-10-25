import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[][] arr = {{16,16},{1008,0,0,0,1},{43,1,111}};
  //System.out.println(ArrayOps.sum(arr));
  //System.out.println(ArrayOps.largest(arr));
  System.out.println(Arrays.toString((ArrayOps.sumRows(arr))));
  }
}
