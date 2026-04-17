
public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("UC20 - Exception Handling During Search Operations");
        System.out.println("===============================================\n");

        String[] bogieIds = {};
        String searchId = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchId);
            if (found) {
                System.out.println("\nBogie " + searchId + " found in train consist.");
            } else {
                System.out.println("\nBogie " + searchId + " not found in train consist.");
            }
        } catch (IllegalStateException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }

    public static boolean searchBogie(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cause message: Bogies collection is empty. Cannot perform search.");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
