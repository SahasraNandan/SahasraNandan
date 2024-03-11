package partices;

public class SortTheArrayAndDispayTheShortListNormalCode {

    public static void main(String[] args) {

        int[] num2={2,3,4,1};

        bubbleSort(num2);



    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            int temp=0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;

                }
            }
            System.out.println( temp);
        } while (swapped);
    }
}