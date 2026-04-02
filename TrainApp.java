import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main Application Class
public class TrainApp {

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort bogies by capacity using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("=== Train Consist: Sorted Passenger Bogies ===\n");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}