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
    
    
}
