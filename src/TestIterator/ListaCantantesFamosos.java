package TestIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCantantesFamosos {
    public ArrayList<CantanteFamoso> listaCantantesFamosos;

    public ListaCantantesFamosos(){
        listaCantantesFamosos = new ArrayList<CantanteFamoso>();
    }
        
    public void addCantanteFamoso(CantanteFamoso cantante){
        listaCantantesFamosos.add(cantante);
    }
    
	public void listarCantantes(){
		System.out.println("Estos son los cantantes actualmente registrados:");
    	Iterator<CantanteFamoso> it = listaCantantesFamosos.iterator();
    	CantanteFamoso tmpCantante= new CantanteFamoso("", "");
    	while(it.hasNext()){
    		tmpCantante = it.next();
    		System.out.print("Cantante: " + tmpCantante.getNombre());
        	System.out.print("\tDisco más vendido: " + tmpCantante.getDiscoConMasVentas()+"\n");
    	}    	
    }   
}
