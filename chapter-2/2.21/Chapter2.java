import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter investment amount: ");
    double amount = sc.nextDouble();

    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = sc.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;

    System.out.print("Enter number of years: ");
    double noOfYears = sc.nextDouble();
    sc.close();

    double futureValue = amount * Math.pow((1 + monthlyInterestRate), noOfYears * 12);

    System.out.println("Future value is $" + futureValue);
  }  
}
