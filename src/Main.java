
/*
class TempUnitConvert
main ()
num fahrenheit
num celsius
output “What is the temperature in Fahrenheit?”
input fahrenheit
celsius = (fahrenheit - 32) * 5/9
output “The temperature in Celsius is” + celsius
return
end class
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        double fahr;
        int celc = 0;
        //prompt user to enter the temperature
        System.out.println("What is the temperature in Celsius?");
        //take the user input
        if (input.hasNextInt()) {
            celc = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        //do math
        fahr = (celc * 1.8) + 32 ;
        System.out.println("The temperature in Fahrenheit is " + fahr );
    }
}