public class Sorts{
  /**Bubble sort of an int dataay.
  *@postcondition The dataay will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
    int n = data.length;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (data[j] > data[j+1]) {
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
    }
  }
}
