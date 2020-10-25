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
  public static int[] sumRows(int[][] matrix){
    int[]answers = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      answers[i] = ArrayOps.sum(matrix[i]);
    }
    return answers;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] outcome = new int[matrix.length];
    int largest = 0;
    for (int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        if (matrix[i][j] > largest){
          largest = matrix[i][j];
        }
      }
      outcome[i] = largest;
      largest = 0;
    }
    return outcome;
  }
  public static int sum(int[][] arr){
    int[] sums = new int[arr.length];
    sum[] = ArrayOps.sumRows(arr);
    return ArrayOps.sum(sums);
  }
}
