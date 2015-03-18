package C67_Conversiones;

import javax.swing.JOptionPane;

public class Ejemplo1 {
    public static void main (String[] Args) {
        Integer entradaInt=0;
    	String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un número:" );
    	//entradaUsuario=(Integer)entradaUsuario;
        entradaInt = entradaInt.valueOf(entradaUsuario);
        System.out.println ("El doble del número introducido es: " + 2*entradaInt + " y el cuadrado del numero que introdujo, es: " + entradaInt*entradaInt);    	
    }
}
