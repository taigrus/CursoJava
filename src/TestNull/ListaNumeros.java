package TestNull;

import java.util.ArrayList;

public class ListaNumeros {
	     private ArrayList<Integer> listaDeNumeros;
	     
	     public ListaNumeros () {
	    	 listaDeNumeros = new ArrayList<Integer>();
	     }

	     public Integer sumatorio () {
	         Integer suma = 0;
	         for (Integer numero : listaDeNumeros) { suma = suma + numero; }
	         return suma;
	     }

	     public void aņadirItem (Integer item) {
	           listaDeNumeros.add (item);
	     } 
}
