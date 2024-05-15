/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mennnnuuu;

import java.util.*;

/**
 *
 * @author dell1
 */
public class Mennnnuuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       
       System.out.println("Menu");
       System.out.println("====");
       System.out.println("ADD");
       System.out.println("SUB");
       System.out.println("MUL");
       System.out.println("DIV");
       
       System.out.println("Enter 2 Numbers");
       int x=sc.nextInt();
       int y=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter Option in Words ");
       String option=sc.nextLine();
       option=option.toUpperCase();
       
       switch(option)
       {
           case "ADD": System.out.println("Sum is "+(x+y));
                        break;
           case "SUB": System.out.println("Difference is "+(x-y));
                        break;
           case "MUL": System.out.println("Product is "+(x*y));
                        break;
           case "DIV": System.out.println("Ratio is "+(x/y));
                        break;
           default:     System.out.println("Invalid Option");
                        break;    
    }
    }
    
}
