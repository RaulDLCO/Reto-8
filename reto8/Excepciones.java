/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto8;

import java.io.IOException;

public class Excepciones {
    public double ladoa;
    public double ladob;
    public boolean esValido;
    
    public double CalculaHipotenusa(double a, double b) throws IOException{
    return Math.sqrt((a*a)+(b*b));
    }
    
    private boolean validaDatos(double a, double b) throws NumberFormatException{
        return true;
    }
}
