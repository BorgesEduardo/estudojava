/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Eduardo
 */
public class CalculoRaio {
    
    public static final double PI = 3.14;
    
    
    public double circunferencia(double raio){
        
        return (2.00 * PI * raio);
    }
    
    public double volume(double raio){
        
        return (4.00 * PI * raio * raio * raio / 3.00);
    }
    
}
