package C67_Conversiones;

import javax.swing.JOptionPane;

public class Ejemplo1 {
    public static void main (String[] Args) {
        Integer entradaInt=0;
    	String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un n�mero:" );
    	//entradaUsuario=(Integer)entradaUsuario;
        entradaInt = entradaInt.valueOf(entradaUsuario);
        System.out.println ("El doble del n�mero introducido es: " + 2*entradaInt + " y el cuadrado del numero que introdujo, es: " + entradaInt*entradaInt);    	
    }
}
