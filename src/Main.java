
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
        int celc;
        //prompt user to enter the temperature
        System.out.println("What is the temperature in Celsius?");
        //take the user input
        celc = input.nextInt();
        //do math
        fahr = (celc * 1.8) + 32 ;
        System.out.println("The temperature in Fahrenheit is " + fahr );
    }
}