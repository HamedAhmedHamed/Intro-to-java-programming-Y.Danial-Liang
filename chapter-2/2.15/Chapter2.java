import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x1 and y1: ");

    double x1 = sc.nextDouble(),
           y1 = sc.nextDouble();

    System.out.print("Enter x2 and y2: ");
    double x2 = sc.nextDouble(),
           y2 = sc.nextDouble();   
    sc.close();

    double deltaX = x2 - x1,
           deltaY = y2 - y1;
    
    double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

    System.out.println("The distance between the two points is " + distance);
  } 
}
