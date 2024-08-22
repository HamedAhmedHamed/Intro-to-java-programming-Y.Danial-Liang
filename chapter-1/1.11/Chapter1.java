public class Chapter1 {
  public static void main(String[] args) {
    final int    currentPopulation   = 312_032_486;
    final double birthPerSeconds     = 1.0/7;
    final double deathPerSeconds     = 1.0/13;
    final double immigrantPerSeconds = 1.0/45;

    final double second = 1;
    final double minute = 60  * second;
    final double hour   = 60  * minute;
    final double day    = 24  * hour;
    final double year   = 365 * day;

    double changeInPopulation   = birthPerSeconds + immigrantPerSeconds - deathPerSeconds;
    double newPopulation        = 5 * year * changeInPopulation;
    int populationProjection = (int)(newPopulation + currentPopulation);

    System.out.println("population projection: " + populationProjection);
  } 
}
