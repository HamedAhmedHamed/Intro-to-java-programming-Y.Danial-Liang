import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the side: ");    

    double length = sc.nextDouble();
    sc.close();

    double area = 3 * Math.sqrt(3) * Math.pow(length, 2) / 2;

    System.out.println("The area of the hexagon is " + area);
  } 
}
