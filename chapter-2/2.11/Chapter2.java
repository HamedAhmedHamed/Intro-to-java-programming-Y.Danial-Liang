import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final int    currentPopulation   = 312_032_486;
    final double birthPerSeconds     = 1.0/7;
    final double deathPerSeconds     = 1.0/13;
    final double immigrantPerSeconds = 1.0/45;

    final int second = 1;
    final int minute = 60  * second;
    final int hour   = 60  * minute;
    final int day    = 24  * hour;
    final int year   = 365 * day;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of years: ");    

    int noOfYears = sc.nextInt();
    sc.close();

    double changeInPopulation   = birthPerSeconds + immigrantPerSeconds - deathPerSeconds;
    int populationProjection = (int)(noOfYears * year * changeInPopulation) + currentPopulation;

    System.out.println("The population in " + noOfYears +" years is " + populationProjection);
  } 
}
