import java.util.Scanner;
/**
 *
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // ask the user to enter an integer
    System.out.println("Please enter a positive integer");
    int integerUser = input.nextInt();
    // create a for loop 
    for(int i = 1; i <= integerUser; i++){
      // print out the count to the screen
      System.out.print(i);
      // create an if statement for ,
      if (i < integerUser){
        // print it out to the screen
      System.out.print(",");
      }
    }
    
  }
}
