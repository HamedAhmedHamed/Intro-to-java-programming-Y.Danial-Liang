import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.print("Enter speed and acceleration: ");

    double speed = sc.nextDouble(),
           acc   = sc.nextDouble();
    sc.close();

    double length = Math.pow(speed, 2) / (2 * acc);

    System.out.println("The minimum runway length for this airplane is " + length);
  } 
}
