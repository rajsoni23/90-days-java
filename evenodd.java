import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the remainder is 0 when divided by 2
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}
