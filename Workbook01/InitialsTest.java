package Workbook01;

import java.util.Scanner;

public class InitialsTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create both objects for each char
    Initials init1 = new Initials();
    Initials init2 = new Initials();

    /*
     * Assign a value using the setter method for both chars and set the input
     * always to lowercase so there wont be a mix of upperCase and LowerCase
     */
    System.out.print("Enter a single character form a to z: ");
    init1.setInitial(input.next().toLowerCase().charAt(0));

    System.out.printf("\nEnter a single character form a to z\nand other than %c: ", init1.getInitial());
    init2.setInitial(input.next().toLowerCase().charAt(0));

    // output which char comes before alphabetically from the Initials objects
    System.out.printf("The \'%c\' falls alphabetically before \'%c\'",
        init1.checkInits(init2.getInitial()) ? init1.getInitial() : init2.getInitial(),
        init1.checkInits(init2.getInitial()) ? init2.getInitial() : init1.getInitial());

    input.close();
  }
}
