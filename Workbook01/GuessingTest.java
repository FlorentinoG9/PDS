package Workbook01;

import java.util.Scanner;

public class GuessingTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create an object from Guessing
    Guessing num = new Guessing();
    // use the setter method to initialize the secret number
    num.setNumber();

    // ask for input
    System.out.print("Guess a number from 1 - 10\nyou have 5 tries: ");

    for (int i = 0; i < 5; i++) {
      // assign a value to a variable from the user
      int guessNum = input.nextInt();
      // check if the number from the user us the same as the value from the Guess
      // object and return a boolean
      if (num.guess(guessNum)) {
        System.out.println("Congrats you guessed right! YAY! :D");
        break;
      } else if (i < 4) {
        System.out.print("nope that's not it, try again: ");
      } else if (i == 4) {
        System.out.println("Aww, sorry you lose! :C");
      }
    }

    input.close();
  }
}
