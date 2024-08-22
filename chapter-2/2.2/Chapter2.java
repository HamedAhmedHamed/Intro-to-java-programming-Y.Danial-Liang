import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the radius and the height of the cylinder: ");    

    double radius = sc.nextDouble();
    double height = sc.nextDouble();

    double area = radius * radius * Math.PI;
    double volume = area * height;

    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  } 
}
