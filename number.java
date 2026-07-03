import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the numbers between 1-100");
        int secretNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        while (userGuess != secretNumber) {
            System.out.println("Enter your guess: ");
            userGuess = sc.nextInt();
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("Congratulations! You guessed the number.");
        sc.close();
    }
}