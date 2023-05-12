import java.util.Scanner; // Import Scanner class

public class Input {
    public static void main(String[] args) {

    Scanner sca = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter initials");

        String userInitials = sca.nextLine(); // Read user input
        System.out.println("Initials are: " + userInitials); //Output user input
    }
}

