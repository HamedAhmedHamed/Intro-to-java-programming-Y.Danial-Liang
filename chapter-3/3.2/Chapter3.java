import java.util.Scanner;

public class Chapter3 {
  public static void main(String[] args) {
    // (int)(min + Math.random() * range);
    int rand1 = (int)(1 + Math.random() * 9);     
    int rand2 = (int)(1 + Math.random() * 9);     
    int rand3 = (int)(1 + Math.random() * 9);     
    int sum = rand1 + rand2 + rand3;

    Scanner sc = new Scanner(System.in);
    System.out.print(rand1 + " + " + rand2 + " + " + rand3 + " ?= ");
    int ans = sc.nextInt(); 
    sc.close();

    if (sum == ans) {
      System.out.println("correct");
      System.exit(0);
    } else {
      System.out.println("Wrong!");
      System.exit(1);
    }
  } 
}
