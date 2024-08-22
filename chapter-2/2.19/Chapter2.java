import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");

    double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
           x2 = sc.nextDouble(), y2 = sc.nextDouble(),
           x3 = sc.nextDouble(), y3 = sc.nextDouble();
    sc.close();

    double deltaX1 = x2 - x1, deltaY1 = y2 - y1,
           deltaX2 = x3 - x2, deltaY2 = y3 - y2,
           deltaX3 = x3 - x1, deltaY3 = y3 - y1; 

    double side1 = Math.sqrt(Math.pow(deltaX1, 2) + Math.pow(deltaY1, 2)),
           side2 = Math.sqrt(Math.pow(deltaX2, 2) + Math.pow(deltaY2, 2)),
           side3 = Math.sqrt(Math.pow(deltaX3, 2) + Math.pow(deltaY3, 2));
    
    double s = (side1 + side2 + side3) / 2;

    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    System.out.println("The area of the triangle is " + area);
  }  
}
