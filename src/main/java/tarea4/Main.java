/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author javio
 */
public class Main {
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche(2, 2, 2);
        
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
    }
    
}
