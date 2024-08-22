import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
    double balance            = sc.nextDouble(),
           annualInterestRate = sc.nextDouble();
    sc.close();

    double monthlyInterestRate = annualInterestRate / 1200;
    double interest = balance * monthlyInterestRate;

    System.out.println("The interest is " + interest);
  } 
}
