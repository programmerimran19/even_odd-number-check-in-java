/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even_odd;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public class Even_Odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner eo =new Scanner(System.in);
        System.out.println("Enter a number");
        int result = eo.nextInt();
        if(result % 2 ==0)
            System.out.println("This number is Even: " +result);
        else
            System.out.println("This number is Odd: " +result);
    }
    
}
