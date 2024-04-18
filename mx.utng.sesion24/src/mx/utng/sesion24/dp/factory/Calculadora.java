package mx.utng.sesion24.dp.factory;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) throws IOException
 {
 int n1, n2;
 double suma;
 //Interger proporciona un rango de valores entre -9223372036854775808 y +9223372036854775807.
 //La función parseInt comprueba el primer argumento, una cadena, e intenta devolver un entero de la base especificada.
 n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer valor: "));
 n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese segundo valor: "));
 suma=n1+n2;
 //JOptionPane que permite mostrar en el panel de mensaje del resultado de la suama.
 JOptionPane.showMessageDialog(null,"La suma de estos dos valores es: "+suma);
 }


    
}

