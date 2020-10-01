/* Activity 1.2 - Question 2 */
import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String name1;
      String name2;
      String name3;

      System.out.println("Please list three names one by one");
      name1 = scan.nextLine();
      name2 = scan.nextLine();
      name3 = scan.nextLine();
      System.out.println(name3 + " " + name2 + " " + name1);
    }
}