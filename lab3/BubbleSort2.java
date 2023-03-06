package lab3;

/**
 * @author bazz
 * Mar 05 2023
 * 23:03
 */
public class BubbleSort2 {

    static int[] optimizedBubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    BubbleSort1.swap(arr, i, j);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }
}
