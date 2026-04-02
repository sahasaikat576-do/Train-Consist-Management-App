import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal bogies: " + trainFormation.size());

        System.out.println("\nProgram continues...");
    }
}