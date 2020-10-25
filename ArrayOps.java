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
    if (arr[0] < 0){
      thelargest = arr[0];
    }
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
      if (matrix[i][0] < 0){
        largest = matrix[i][0];
      }
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
    int[] sums = ArrayOps.sumRows(arr);
    return ArrayOps.sum(sums);
  }
  public static int[] sumCols(int[][] matrix){
    int[][] reverse = new int[matrix[0].length][matrix.length];
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        reverse[j][i] = matrix[i][j];
      }
    }
  return ArrayOps.sumRows(reverse);
 }
 public static boolean isRowMagic(int[][] matrix){
   int falsecheck = 0;
   int[] thesums = ArrayOps.sumRows(matrix);
   for (int i = 0; i < thesums.length - 1; i++){
     if(thesums[i] != thesums[i + 1]){
       falsecheck += 1;
     }
   }
   if(falsecheck == 0){
     return true;
   }
   else {return false;}
 }
  public static boolean isColMagic(int[][] matrix){
  int[][] reverse = new int[matrix[0].length][matrix.length];
  return ArrayOps.isRowMagic(reverse);
  }
}
