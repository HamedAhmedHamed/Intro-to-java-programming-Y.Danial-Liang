import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double ANUAL_INTEREST_RATE = 0.05;
    final double MONTHLY_INTEREST_RATE = ANUAL_INTEREST_RATE / 12; 

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount: ");

    double amount = sc.nextDouble();
    sc.close();

    double firstMonthInterest = amount * (1 + MONTHLY_INTEREST_RATE);
    firstMonthInterest += amount;

    double secondMonthInterest = firstMonthInterest * (1 + MONTHLY_INTEREST_RATE);
    secondMonthInterest += amount;

    double thirdMonthInterest = secondMonthInterest * (1 + MONTHLY_INTEREST_RATE);
    thirdMonthInterest += amount;

    double fourthMonthInterest = thirdMonthInterest * (1 + MONTHLY_INTEREST_RATE);
    fourthMonthInterest += amount;

    double fifthMonthInterest = fourthMonthInterest * (1 + MONTHLY_INTEREST_RATE);
    fifthMonthInterest += amount;

    double sixthMonthInterest = fifthMonthInterest * (1 + MONTHLY_INTEREST_RATE);
    System.out.println("After the sixth month, the account value is $" + sixthMonthInterest);
  }  
}
