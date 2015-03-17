package TestArrays;

import utiles.EntradaDeTexto;

public class MesSecreto {
	
	public static void main(String [] args){
		
		EntradaDeTexto respuesta;
		String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};		
		String mesSecreto = meses[9];
		System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
		respuesta=new EntradaDeTexto();
		while(!respuesta.getEntrada().equals(mesSecreto)){
			System.out.println("No ha acertado, intente adivinarlo introduciendo otro mes: ");
			respuesta=new EntradaDeTexto();
		}
		System.out.println("¡Ha acertado!, felicidades.");
	}		
}

