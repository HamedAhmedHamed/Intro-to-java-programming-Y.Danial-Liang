import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double POUNDS_TO_KILOGRAMS = 0.454;

    Scanner sc = new Scanner(System.in);    
    System.out.print("Enter a number in pounds: ");

    double pounds = sc.nextDouble();
    double kilograms = pounds * POUNDS_TO_KILOGRAMS;

    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  } 
}
