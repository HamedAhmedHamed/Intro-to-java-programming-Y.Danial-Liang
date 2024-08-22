public class Chapter1 {
  public static void main(String[] args) {
    final double milesToKilometers = 1.6;
    final double minutesToSeconds  = 60;
    final double hoursToSeconds    = minutesToSeconds * minutesToSeconds;

    final double miles   = 24;
    final double hours   = 1;
    final double minutes = 40;
    final double seconds = 35;

    double totalKilometers = miles * milesToKilometers;
    double totalSeconds    = hours * hoursToSeconds + minutes * minutesToSeconds + seconds;
    double avgSpeed        = totalKilometers / totalSeconds;

    System.out.println("avg speed: " + avgSpeed);
  } 
}
