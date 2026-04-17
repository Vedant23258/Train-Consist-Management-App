import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("===============================================\n");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        Arrays.sort(bogieIds);

        String searchId = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = binarySearch(bogieIds, searchId);

        if (found) {
            System.out.println("\nBogie " + searchId + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }

        System.out.println("\nUC19 search completed...");
    }

    public static boolean binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
