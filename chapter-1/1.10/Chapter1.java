public class Chapter1 {
  public static void main(String[] args) {
    final double kilometerToMiles = 1.0 /1.6;
    final double minutesToHours  = 1.0 / 60;
    final double secondsToHours  = 1.0 / 3600;

    final double kilometers = 14;
    final double minutes = 45;
    final double seconds = 30;

    double totalMiles = kilometers * kilometerToMiles;
    double totalHours = minutes * minutesToHours + seconds * secondsToHours;
    double avgSpeed = totalMiles / totalHours; 

    System.out.println("avgSpeed: " + avgSpeed);
  } 
}
