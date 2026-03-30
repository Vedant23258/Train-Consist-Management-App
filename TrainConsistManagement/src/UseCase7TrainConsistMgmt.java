import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class UseCase7TrainConsistMgmt {

    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " – " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("UC7: Sort Bogies by Capacity (Comparator)");
        System.out.println("************************************\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 50));
        bogies.add(new Bogie("AC Chair", 30));
        bogies.add(new Bogie("First Class", 70));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting complete.");
    }
}