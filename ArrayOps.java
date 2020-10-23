public class ArrayOps{
  public static int sum(int[] arr){
    int thesum = 0;
    for (int i = 0; i < arr.length; i++){
      thesum = thesum + arr[i];
    }
    return thesum;
  }
  public static int largest(int[] arr){
    int thelargest = 0;
    for(int i = 0; i < arr.length; i++){
      if (arr[i] > thelargest){
        thelargest = arr[i];
      }
    }
    return thelargest;
  }
}
