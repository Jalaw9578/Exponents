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
        Scanner keyedinput = new Scanner(System.in);
        System.out.print("whats your base? :");
        int base = keyedinput.nextInt();
        System.out.print("whats your exponent? :");
        int exponent = keyedinput.nextInt();
        int output = 1;
        for(int i = 1;i<=exponent;i++){
            output = output * base;
            
        }
        System.out.println(output);
        }
    }
    

