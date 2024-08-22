import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");

    double amount = sc.nextDouble();
    double gratuityRate = sc.nextDouble() / 100;
    double gratuity = amount * gratuityRate;
    double totalAmount = amount + gratuity;

    System.out.println("The gratuity is $" + gratuity + " and the total is $" + totalAmount);
  } 
}
