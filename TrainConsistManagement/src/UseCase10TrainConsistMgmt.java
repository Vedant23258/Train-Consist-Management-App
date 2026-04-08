import java.util.*;
import java.util.stream.*;

public class UseCase10TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UCB - Count Total Seats in Train");
        System.out.println("================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("\nBogies in Train:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);      // Sum all values

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUCB aggregation completed...");
    }
}