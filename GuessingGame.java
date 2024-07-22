import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int numberToGuess = ran.nextInt(100) + 1; // Generate random number between 1 to 100
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You Have To Choose The number between 1 and 100.");

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Number You Have Enterd is  low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Number You have enterd is  high! Try again.");
            } else {
                hasGuessed = true;
            }
        }
        
        System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
        System.out.println();
        sc.close();
    }
}