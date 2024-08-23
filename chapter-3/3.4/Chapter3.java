public class Chapter3 {
  public static void main(String[] args) {
    int randomMonthIndex = (int)(1 + Math.random() * 11);
    String randomMonth = "";
    switch (randomMonthIndex) {
      case 1:
        randomMonth = "January"; break;
      case 2:
        randomMonth = "February"; break;
      case 3:
        randomMonth = "March"; break;
      case 4:
        randomMonth = "April"; break;
      case 5:
        randomMonth = "May"; break;
      case 6:
        randomMonth = "June"; break;
      case 7:
        randomMonth = "July"; break;
      case 8:
        randomMonth = "August"; break;
      case 9:
        randomMonth = "September"; break;
      case 10:
        randomMonth = "October"; break;
      case 11:
        randomMonth = "November"; break;
      case 12:
        randomMonth = "December"; break;
      default:
        break;
    }

    System.out.println(randomMonth);
  }  
}
