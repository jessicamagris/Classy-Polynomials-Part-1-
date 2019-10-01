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
public class Polynomial {
    public int[] v;

    @Override
    public String toString() {
        if(v.length == 1) 
            return "" + v[0];
        int esp = v.length - 1;
        StringBuilder ris = new StringBuilder();
        for (int i = 0; i <= v.length - 1; i++, esp--) {
            if (v[i] == 0) {
                continue;
            }
            if (esp == 0) {
                ris.append(v[i]);
                break;
            }
            if(v[i]!=1)
                ris.append(v[i]);
            ris.append("x");
            if(esp!=1)
                ris.append("^").append(esp);
            ris.append("+");

        }
       return ris.toString();
    }

    public Polynomial(int[] v) {
        this.v = v;
    }


}
