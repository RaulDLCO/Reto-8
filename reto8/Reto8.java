package reto8;

import java.io.IOException;

public class Reto8 {

    public static void main(String[] args) throws IOException {
        Excepciones valor = new Excepciones();
        System.out.println("Valor de hipotenusa: ");
        double recibe = valor.CalculaHipotenusa(2.5,5.5);
        System.out.println(recibe);
    }
    
}
