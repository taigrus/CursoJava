package C67_Conversiones;

import javax.swing.JOptionPane;

public class Ejemplo1 {
    public static void main (String[] Args) {
        Integer entradaInt=0;
    	String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un número entero:" );
        entradaInt=entradaInt.valueOf(entradaUsuario);
        //String salida = JOptionPane.showInternalMessageDialog(null,"El doble del número introducido es: ","Mnesaje",JOptionPane.INFORMATION_MESSAGE);
        System.out.println ("El doble del número introducido es: " + 2*entradaInt + " y el cuadrado del número que introdujo, es: " + entradaInt*entradaInt);    	
    }
}
