import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    
    int number = sc.nextInt();
    int ones = number % 10;
    number /= 10;
    int tens = number % 10;
    number /= 10;
    int hundreds = number;

    int sumOfDigits = ones + tens + hundreds;
    System.out.println(hundreds + " + " + tens + " + " + ones + " = " + sumOfDigits);
  } 
}
