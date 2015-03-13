package TestIterator;

import java.util.ArrayList;

public class ListaCantantesFamosos {
    public ArrayList<CantanteFamoso> listaCantantesFamosos;

    public ListaCantantesFamosos(){
        listaCantantesFamosos = new ArrayList<CantanteFamoso>();
    }
        
    public void addCantanteFamoso(CantanteFamoso cantante){
        listaCantantesFamosos.add(cantante);
    }
    
    public void nuevoCantante(CantanteFamoso cantante){
    	CantanteFamoso cantanteX = new CantanteFamoso(cantante.getNombre(), cantante.getDiscoConMasVentas());
    	this.addCantanteFamoso(cantanteX);
    }
    
    
}
