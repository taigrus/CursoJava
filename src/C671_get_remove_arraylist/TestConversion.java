package C671_get_remove_arraylist;

import java.util.ArrayList;

public class TestConversion {
	
	 public static void main (String [] Args) {  
		    ArrayList<Integer> miListadoAL;
		    miListadoAL = new ArrayList<Integer>();
		    ArrayList<Integer> tmpAL = new ArrayList<Integer>();
		    miListadoAL.add(44); miListadoAL.add(7); miListadoAL.add(76); miListadoAL.add(29); miListadoAL.add(17);
		   //Recorremos el ArrayList con un for normal qued�ndonos con los elementos que van a ser operados a posteriori
		    for (int i=1; i <= miListadoAL.size(); i++) {
		        if (miListadoAL.get(i-1) < 10) { System.out.println ("Detectado un objeto (" + i +"):"+miListadoAL.get(i-1)+ ", integer con valor menor de 10, ser� eliminado");
		            tmpAL.add(i-1);}
		        System.out.println ("Elemento en el array list (" + i + ") : " + miListadoAL.get(i-1) );
		    }

		    for (int i=0; i < tmpAL.size(); i++) {
		       System.out.println ("Eliminamos �tem "+ (tmpAL.get(i)+1) +": " + miListadoAL.get(tmpAL.get(i) ) );
		        miListadoAL.remove((int)tmpAL.get(i) );
		    }

		    System.out.println("Valor devuelto por size() en miListadoAL despu�s de borrado: " + miListadoAL.size() );
		    int tmpInt = 0;
		    for (Integer tmpObjeto: miListadoAL) {
		        System.out.println ("Elemento en el array list ("+(tmpInt+1)+") : " + tmpObjeto);
		        tmpInt++;
		    }
		} //Cierre del main
}
