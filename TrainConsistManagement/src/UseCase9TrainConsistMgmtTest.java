import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmtTest {

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

        System.out.println("UCB - Group Bogies By Type Using Streams");
        System.out.println("========================================");

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("Sleeper", 60),
                new Bogie("First Class", 24),
                new Bogie("General", 90),
                new Bogie("AC Chair", 50)
        );

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            entry.getValue().forEach(System.out::println);
        }

        System.out.println("\nUCB grouping completed...");
    }
}