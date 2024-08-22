import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double INCHES_TO_METERS = 0.0245;
    final double POUNDS_TO_KILOGRAMS = 0.45359237;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double pounds = sc.nextDouble();

    System.out.print("Enter height in inches: ");
    double inches = sc.nextDouble();

    double bmi = pounds * POUNDS_TO_KILOGRAMS / Math.pow(inches * INCHES_TO_METERS, 2);

    System.out.println("BMI is " + bmi);
  }
}