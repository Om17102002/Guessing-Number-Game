package guessingNumberGame;

import java.util.Scanner;

public class guessNumber{
 
    public static void guessingNumberGame() {
    
        Scanner obj = new Scanner(System.in);
 
        int number = 1 + (int)(100 * Math.random());

        int i,guess,K = 5;
 
        System.out.println("A number is chosen between 1 to 100 " + "Guess the number within  trials");
 
        for (i = 0; i < K; i++) {
 
            System.out.println("Guess the number:");
 
            guess = obj.nextInt();
 
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == K) {
            System.out.println("Game Over");
            System.out.println("The number was " + number);
        }  
    }
 
  public static void main(String[] args){
        guessingNumberGame();
    }
}
