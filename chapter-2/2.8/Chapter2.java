import java.util.Scanner;

public class Chapter2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the time zone offset to GMT: ");
    int timeZoneOffset = sc.nextInt();
    
    long totalMilliSeconds = System.currentTimeMillis();
    
    long totalSeconds = totalMilliSeconds / 1000;
    long currentSecond = totalSeconds % 60;
    
    int totalMinutes = (int)(totalSeconds / 60);
    int currentMinute = totalMinutes % 60;

    int totalHours = totalMinutes / 60;
    int currentHour = (timeZoneOffset + totalHours) % 24;
    
    sc.close();
    System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
  } 
}
