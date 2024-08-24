import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double POUND_TO_KILOGRAM = 0.4536;
    final double FEET_TO_METER     = 0.3048;
    final double INCH_TO_METER     = 0.0254;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    double pounds = sc.nextDouble();

    System.out.print("Enter feet: ");
    double feet = sc.nextDouble();

    System.out.print("Enter inches: ");
    double inches = sc.nextDouble();
    sc.close();

    double mass   = pounds * POUND_TO_KILOGRAM;
    double height = feet * FEET_TO_METER + inches * INCH_TO_METER; 
    double bmi = (mass) / (Math.pow(height, 2));

    String interpretation = "";
    if (bmi < 18.5)
      interpretation = "Underweight"; 
    else if (bmi >= 18.5 && bmi < 25)
      interpretation = "Normal";
    else if (bmi >= 25 && bmi < 30)
      interpretation = "Overweight";
    else
      interpretation = "Obese";
    
    System.out.println("BMI is " + bmi);
    System.out.println(interpretation);
  } 
}
