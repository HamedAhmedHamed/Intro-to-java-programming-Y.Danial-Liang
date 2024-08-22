import java.util.Scanner;

public class Chapter3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ax + by = e");
    System.out.println("cx + dy = f");
    System.out.print("Enter a, b, c, d, e, f: ");

    double a = sc.nextDouble(), b = sc.nextDouble(),
           c = sc.nextDouble(), d = sc.nextDouble(),
           e = sc.nextDouble(), f = sc.nextDouble();
    sc.close();
    
    double commonDenomerator = a * d - b * c;
    if (commonDenomerator == 0) {
      System.out.println("The equation has no solution.");
      System.exit(1);
    }

    double x = (e * d - b * f) / commonDenomerator,
           y = (a * f - e * c) / commonDenomerator;
    
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    System.exit(0);
  } 
}
