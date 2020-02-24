import java.util.Scanner;

/**
 * This program calculates how long it would take to heat up a certain amount of items.
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 20 2020
 * @version 1.0
 */
 
 
public class microwave {
  static String typeOfFood;
  static int numberOfFood;
  static double time;
  
  /**
  * This class calculates how long it would take to heat up a certain amount of items.
  */
  
  public static void main(String[] args) throws Exception{
    Scanner userInput = new Scanner(System.in);
    System.out.print("would you like a pizza, sub, or soup: ");
    typeOfFood = userInput.nextLine();
    System.out.print("how many would you like up to three?: ");
    numberOfFood = userInput.nextInt();
    if (typeOfFood.equals("pizza")) {
      time = 45;
    }
    if (typeOfFood.equals("sub")) {
      time = 60;
    }
    if (typeOfFood.equals("soup")) {
      time = 105;
    }
    if (numberOfFood == 2) {
      time = time * 1.5;
    }
    if (numberOfFood == 3) {
      time = time * 2;
    }
    System.out.println("your " + typeOfFood + " will be ready in " + time + " seconds.");
  }
}
