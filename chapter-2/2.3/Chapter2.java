import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double FEET_TO_METERS = 0.305;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    
    double feet = sc.nextDouble();
    double meters = feet * FEET_TO_METERS;

    System.out.println(feet + " feet is " + meters + " meters");
  } 
}
