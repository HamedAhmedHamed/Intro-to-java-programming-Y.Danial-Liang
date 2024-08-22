import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the amount of water in kilograms: ");
    double kilograms = sc.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double initialTemperature = sc.nextDouble();

    System.out.print("Enter the final temperature: ");
    double finalTemperature = sc.nextDouble();

    sc.close();
    
    double changeInTemperature = finalTemperature - initialTemperature;
    double energy = kilograms * changeInTemperature * 4184;

    System.out.println("Enter the final temperature: " + energy);
  } 
}
