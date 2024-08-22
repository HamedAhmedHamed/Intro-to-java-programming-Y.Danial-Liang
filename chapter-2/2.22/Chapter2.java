import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an amount in int, for example 1156, the last two digits represent cents: "); 
    int totalAmount = sc.nextInt();
    sc.close();

    int numberOfDollars = totalAmount / 100;

    int remainingCents = totalAmount % 100;

    int numberOfQuarters = remainingCents / 25; 
    remainingCents %= 25;

    int numberOfDimes = remainingCents / 10;
    remainingCents %= 10;

    int numberOfNickels = remainingCents / 5;
    remainingCents %= 5;

    int numberOfPennies = remainingCents;

    System.out.println("Your amount " + totalAmount + " consists of");
    System.out.println(" " + numberOfDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters ");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");
  } 
}
