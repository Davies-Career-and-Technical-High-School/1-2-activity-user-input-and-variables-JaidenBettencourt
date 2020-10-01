/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String name;
      String adjective;

      System.out.println("what is your name?");
      name = scan.nextLine();
      System.out.println("What adjective describes you?");
      adjective = scan.nextLine();
      System.out.print("Your name is "+ name + " and you are "+ adjective);
    }
}