import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // 3. Display Initial Bogie Count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // 4. Program continues...
        System.out.println("System ready to add bogies...");
    }
}