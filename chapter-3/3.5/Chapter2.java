import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter today's day: ");
    int todayDayIndex = sc.nextInt();

    System.out.print("Enter the number of days elapsed since today: ");
    int elapsedDaysIndex = sc.nextInt();
    sc.close();

    int futureDateIndex = (todayDayIndex + elapsedDaysIndex) % 7;
    String futureDate = "";

    switch (futureDateIndex) {
      case 0:
        futureDate = "Sunday"; break;
      case 1:
        futureDate = "Monday"; break;
      case 2:
        futureDate = "Tuesday"; break;
      case 3:
        futureDate = "Wednesday"; break;
      case 4:
        futureDate = "Thursday"; break;
      case 5:
        futureDate = "Friday"; break;
      case 6:
        futureDate = "Saturday"; break;
      default:
        break;
    }

    System.out.println("future date is " + futureDate);
  } 
}
