import java.util.Scanner;

public class MonitaryUnits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the amount of money (e.g. 11.56): ");
    double amount = sc.nextDouble();
    sc.close();

    int remainingAmount = (int)(amount * 100);

    int remainingDollars = remainingAmount / 100;
    remainingAmount %= 100;

    int remainingQuarters = remainingAmount / 25;
    remainingAmount %= 25;

    int remainingDimes = remainingAmount / 10;
    remainingAmount %= 10;

    int remainingNickels = remainingAmount / 5;
    remainingAmount %= 5;

    int remainingPennies = remainingAmount;

    if ( remainingDollars != 0) {
      System.out.println(remainingDollars + " Dollar" + (remainingDollars > 1 ? "s" : " "));
    } 
    if (remainingQuarters != 0) {
      System.out.println(remainingQuarters + " Quarter" + (remainingQuarters > 1 ? "s" : ""));
    }
    if (remainingDimes != 0) {
      System.out.println(remainingDimes + " Dime" + (remainingDimes > 1 ? "s" : ""));
    }
    if (remainingNickels != 0) {
      System.out.println(remainingNickels + " Nickel" + (remainingNickels > 1 ? "s" : ""));
    }
    if (remainingPennies != 0) {
      System.out.println(remainingPennies + " Penn" + (remainingPennies > 1 ? "ies" : "y"));
    }

    if (remainingAmount == 0) {
      System.out.println("Please enter the amount");
      System.exit(1);
    }

    System.exit(0);
  } 
}
