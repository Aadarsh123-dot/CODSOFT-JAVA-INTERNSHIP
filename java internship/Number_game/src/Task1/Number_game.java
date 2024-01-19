package Task1;
import java.util.Random;
import java.util.Scanner;
public class Number_game {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r=new Random();
		int lowerBound=1;
		int upperBound=100;
		int maxAttempt=10;
		int rounds=0;
		int score=0;

		System.out.println("Welcome to the Number Guessing Game!");
		while(true){
			int targetNumber=r.nextInt(100);
			int attempts = 0;

			System.out.println("Round "+(rounds+1)+":");
			System.out.println("You have chosen a number between "+lowerBound+ " and "+upperBound+". Try to guess it!");

			while(attempts<maxAttempt){
				System.out.print("Enter your guess: ");
				int userGuess= sc.nextInt();
				attempts++;
				if(userGuess==targetNumber){
					System.out.println("Congratulations! you guessed the correct number in "+attempts+" attempts. ");
					score++;
					break;
				}
				else if (userGuess<targetNumber){
					System.out.println("Your Guess is too low. Try again.");
				}
				else{
					System.out.println("Your Guess is too high. Try again.");
				}

				if (attempts==maxAttempt){
					System.out.println("Sorry, you have reached the maximum number of attempts. The correct number is: "+targetNumber);
				}
			}
			System.out.print("Do you want to play another round? (yes/no): ");
			String playAgain=sc.next();

			if (!playAgain.equalsIgnoreCase("yes")){
				System.out.println("Thank You Playing :) ! Your Total Score is: "+score+" out of "+(rounds+1)+" rounds won.");
				break;
			}

			rounds++;
		}
		sc.close();

	}
}
