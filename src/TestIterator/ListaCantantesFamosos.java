package TestIterator;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.EntradaDeTexto;

public class ListaCantantesFamosos {
    public ArrayList<CantanteFamoso> listaCantantesFamosos;

    public ListaCantantesFamosos(){
        listaCantantesFamosos = new ArrayList<CantanteFamoso>();
    }
        
    public void addCantanteFamoso(CantanteFamoso cantante){
    	listaCantantesFamosos.add(cantante);
    }
    
    public void addFormularioCantanteFamoso(){
    	EntradaDeTexto nombre, disco;
    	System.out.print("Ingrese el nombre de un nuevo cantane: ");
        nombre = new EntradaDeTexto();
        System.out.print("Ingrese el nombre de disco m�s vendido para este cantante: ");
        disco = new EntradaDeTexto();
        listaCantantesFamosos.add(new CantanteFamoso(nombre.getTextoCapitalizado(), disco.getTextoCapitalizado()));
    }
    
	public void listarCantantes(){
		System.out.println("Estos son los cantantes actualmente registrados:");
    	Iterator<CantanteFamoso> it = listaCantantesFamosos.iterator();
    	CantanteFamoso tmpCantante= new CantanteFamoso("", "");
    	while(it.hasNext()){
    		tmpCantante = it.next();
    		System.out.printf("Cantante: %s", tmpCantante.getNombre());
        	System.out.printf("\tDisco m�s vendido: %s\n", tmpCantante.getDiscoConMasVentas());
    	}    	
    }   
}
