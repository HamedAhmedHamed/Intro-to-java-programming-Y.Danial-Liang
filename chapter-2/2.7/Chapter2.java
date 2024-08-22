import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    final double MINUTES_TO_HOURS = 1.0/60;
    final double HOURS_TO_DAYS    = 1.0/24;
    final double DAYS_TO_YEARS    = 1.0/365;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");    

    long minutes = sc.nextLong();
    int years    = (int)(minutes * MINUTES_TO_HOURS * HOURS_TO_DAYS * DAYS_TO_YEARS);
    int days     = (int)(minutes * MINUTES_TO_HOURS * HOURS_TO_DAYS) % 365;

    System.out.println(years + " " + days);
  } 
}
