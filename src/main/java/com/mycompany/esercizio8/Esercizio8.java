/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio8;

/**
 *
 * @author jessi
 */
public class Esercizio8 {
      public static void main(String[] args) {
      int v[]={5,6,7,8,3,4,5,5};
      System.out.println(metodo(v));
        

    }
      public static String metodo(int[] v){
             Polynomial p= new Polynomial(v);
             return p.toString();
      }
    
}
