/*
Jack Lawrence
12th of March 2020
This program allows the calculation of exponents/powers
 */

package exponentsu2a2;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class ExponentsU2A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaring variables
        int base;
        int output;
        Scanner keyedinput = new Scanner(System.in);
        //describing program to user
        System.out.println("1… Find the value of a number squared (NOTE: 2^2 = 2 x 2)\n" +
        "2… Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)\n" +
        "3… Find the value of a number, to any power\n" +
        "4… Exit");
        int select = keyedinput.nextInt();
        // finding option selected
        switch(select){
            case 1:
                //calculate a number to the second power
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                output = base*base;
                System.out.println(output);
            break;
            case 2:
                //calculate a number to the third power
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                output = base*base*base;
                System.out.println(output);
            break;   
            case 3:
                //calculate a number to any power
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                System.out.print("whats your exponent? :");
                int exponent = keyedinput.nextInt();
                // ensuring any^0 = 1
                output = 1;
                for(int i = 1;i<=exponent;i++){
                    //multiplying the product by base every loop
                    output = output * base;

                }
                System.out.println(output);
            break;
            case 4:
                //exiting
                System.out.println("Bye!");
                System.exit(0);    
            break;    
        }
        }
    }
    

