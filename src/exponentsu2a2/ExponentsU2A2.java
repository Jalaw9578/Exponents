/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int base;
        int output;
        Scanner keyedinput = new Scanner(System.in);
        System.out.println("1… Find the value of a number squared (NOTE: 2^2 = 2 x 2)\n" +
        "2… Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)\n" +
        "3… Find the value of a number, to any power\n" +
        "4… Exit");
        int select = keyedinput.nextInt();
        switch(select){
            case 1:
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                output = base*base;
                System.out.println(output);
            break;
            case 2:
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                output = base*base*base;
                System.out.println(output);
            break;   
            case 3:
                System.out.print("whats your base? :");
                base = keyedinput.nextInt();
                System.out.print("whats your exponent? :");
                int exponent = keyedinput.nextInt();
                output = 1;
                for(int i = 1;i<=exponent;i++){
                    output = output * base;

                }
                System.out.println(output);
            break;
            case 4:
                System.out.println("Bye!");
                System.exit(0);    
            break;    
        }
        }
    }
    

