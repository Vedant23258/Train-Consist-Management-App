
public class UseCase16TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Use Case 16 - Manual Sorting using Bubble Sort ");
        System.out.println("==============================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);

        System.out.println("\nUC16 sorting completed...");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
