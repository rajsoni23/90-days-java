import java.util.Scanner;

public class MiniMovieAI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🤖 Hello! I am MovieBot, a mini AI helper.");
        System.out.println("Let me recommend a movie for you today.");
        System.out.println("----------------------------------------");
        
        // Step 1: Query the user for basic input
        System.out.print("Do you want to watch something exciting? (yes/no): ");
        String excitingInput = scanner.nextLine().trim().toLowerCase();
        
        boolean wantsExciting = excitingInput.equals("yes") || excitingInput.equals("y");
        
        // Step 2: The Decision Tree (The "Reasoning" engine)
        String recommendation = "";
        
        if (wantsExciting) {
            System.out.print("Do you prefer futuristic sci-fi or intense action? (scifi/action): ");
            String subGenre = scanner.nextLine().trim().toLowerCase();
            
            if (subGenre.contains("sci")) {
                recommendation = "Interstellar (2014) - A mind-bending journey through space and time.";
            } else {
                recommendation = "Mad Max: Fury Road (2015) - A non-stop, high-octane chase across a desert wasteland.";
            }
        } else {
            System.out.print("Do you want to laugh or do you want a deep story? (laugh/deep): ");
            String subGenre = scanner.nextLine().trim().toLowerCase();
            
            if (subGenre.contains("laugh") || subGenre.contains("comedy")) {
                recommendation = "The Grand Budapest Hotel (2014) - A quirky, hilarious, and beautifully styled comedy.";
            } else {
                recommendation = "The Shawshank Redemption (1994) - An incredibly moving story about hope and friendship.";
            }
        }
        
        // Step 3: Output the AI decision
        System.out.println("\n🧠 [AI Analysis Complete]");
        System.out.println("Based on your mood, I highly recommend watching:");
        System.out.println("👉 " + recommendation);
        System.out.println("\nEnjoy your movie night! 🍿");
        
        scanner.close();
    }
}
