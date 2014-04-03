/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testp;

import java.util.Scanner;

/**
 *
 * @author ola
 */
public class Testp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Testp p = new Testp();
        System.out.println("Hello world!");
        System.out.println("Hello"+" " + p.readName());
    }
    private String readName(){
        Scanner sc = new Scanner(System.in);
        String name;
        
        System.out.println("What is your name?");
        name =sc.nextLine();
        
        return name;
    }
}
