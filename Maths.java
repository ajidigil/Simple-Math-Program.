/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maths;
import java.util.Scanner;
/**
 *
 * @author AJI
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int x, y, z;
      System.out.println("Enter two integers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      System.out.println("Sum of entered integers = "+z);
    }
    
}
