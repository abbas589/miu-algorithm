package lab1;

/**
 * @author bazz
 * Mar 05 2023
 * 13:51
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        optimizedBubbleSort(new int[]{12, 34, 5, 4, 6, 7});
        optimizedBubbleSort(new int[]{1, 2, 3, 4, 5, 6, 7}); //BEST CASE
        optimizedBubbleSort(new int[]{7, 6, 5, 4, 3, 2, 1}); //WORST CASE
    }

    static int[] optimizedBubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, i, j);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
