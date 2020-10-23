public class ArrayOps{
  public static int sum(int[] arr){
    int thesum = 0;
    for (int i = 0; i < arr.length; i++){
      thesum = thesum + arr[i];
    }
    return thesum;
  }
}
