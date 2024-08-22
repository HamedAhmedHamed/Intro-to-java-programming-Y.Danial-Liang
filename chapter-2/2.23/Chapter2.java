import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the driving distance: ");
    double miles = sc.nextDouble();

    System.out.print("Enter miles per gallon: ");
    double milePerGallon = sc.nextDouble();

    System.out.print("Enter price per gallon: ");
    double dollarPerGallon = sc.nextDouble();
    sc.close();

    double consumedGallons = miles / milePerGallon;
    double gallonsCost = consumedGallons * dollarPerGallon; 

    System.out.println("The cost of driving is " + gallonsCost);
  } 
}
