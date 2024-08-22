import java.util.Scanner;

public class Chapter3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a, b, c: ");
    double a = sc.nextInt(),
           b = sc.nextInt(),
           c = sc.nextInt();
    sc.close();

    double discriminant = Math.pow(b, 2) - 4 * a * c;
    if (discriminant < 0) {
      System.out.println("The equation has no real roots");
      System.exit(1);

    } else if (discriminant == 0) {
      double x = (-b + Math.sqrt(discriminant)) / 2 * a;
      System.out.println("The equation has one root: " + x);
      System.exit(0);

    } else {
      double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
      double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

      System.out.println("The equation has two roots: " + x1 + " and " + x2);
      System.exit(0);
    }  
  } 
}
