/* Activity 1.2 - Question 1 */
import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String name;

      System.out.println("What is your name?");
      name = scan.nextLine();
      System.out.println("Hi, " + name + ", nice to see you");

    }
}