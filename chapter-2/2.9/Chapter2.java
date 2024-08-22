import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter v0, v1, and t: ");

    double v0 = sc.nextDouble(),
           v1 = sc.nextDouble(),
           t  = sc.nextDouble();

    double deltaV = v1 - v0;
    double acc = deltaV / t;

    sc.close();
    System.out.println("The average acceleration is " + acc);
  } 
}
