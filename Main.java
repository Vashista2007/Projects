import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        // prints new line 
        System.out.println("");

        System.out.println("Please select the difficulty level");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        // prints new line
        System.out.println("");

        // inputing a value in java 
        Scanner detail = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int level = detail.nextInt();
        int num_guesses = 0;

        if (level == 1) {
            System.out.println("Great! You have selected the Easy difficulty level.");
            num_guesses = 10;
        }
        else if (level == 2){
            System.out.println("Great! You ahve selected the Medium difficulty level.");
            num_guesses = 5;
        }
        else if (level == 3){
            System.out.println("Great! You have selected the Hard difficulty level.");
            num_guesses = 3;
        }
        System.out.println("Let's start the game!");

        // Math.random() gives a random decimal digit between 0(inclusive) and 1(exlusive)
        // generates random value formula is: (int)(Math.random() * (max - min + 1)) + min
        double value = (int)(Math.random()*100) + 1;

        for (int i = 1; i <= num_guesses; i++){
            System.out.print("Enter your Guess: ");
            int guess = detail.nextInt();
            if (guess == value){
                System.out.println("Congragulations! You guessed the correct number in " + i + " attempts.");
                break;
            }
            else if (guess < value){
                System.out.println("Incorrect! The number is greater than "+guess);
            }
            else if (guess > value){
                System.out.println("Incorrect! The number is less than "+guess);
            }
            
        }
        System.out.print("Sorry, you lost the game correct number is "+value);
        

    }
}