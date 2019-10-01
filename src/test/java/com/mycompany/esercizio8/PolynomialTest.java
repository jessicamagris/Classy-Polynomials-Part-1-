/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessi
 */
public class PolynomialTest {
    
    
     @Test
     public void Test() {
               int v[]={5,6,7,8,3,4,5,5};

         assertEquals(Esercizio8.metodo(v),"5x^7+6x^6+7x^5+8x^4+3x^3+4x^2+5x+5");
     }
}
