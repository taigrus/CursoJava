package TestIterator;

import java.util.Iterator;
import utiles.EntradaDeTexto;

public class TestCantantesFamosos {
	

	
	
    public static void main(String[] args){
        ListaCantantesFamosos listaCantantes;
        listaCantantes=new ListaCantantesFamosos();
        CantanteFamoso cantante1 = new CantanteFamoso("uno","disco1");
        listaCantantes.addCantanteFamoso(cantante1);
        CantanteFamoso cantante2 = new CantanteFamoso("dos","disco2");
        listaCantantes.addCantanteFamoso(cantante2);
        listarCantantes(listaCantantes);
        EntradaDeTexto nombre,disco;
        System.out.println("Ingrese un nuevo cantane: ");
        nombre = new EntradaDeTexto();
        System.out.println("Ingrese un nuevo disco para el cantante: ");
        disco = new EntradaDeTexto();
        CantanteFamoso cantante3 = new CantanteFamoso(nombre.getEntrada(),disco.getEntrada());
        listaCantantes.addCantanteFamoso(cantante3);
        listarCantantes(listaCantantes);
    }
    
	private static void listarCantantes(ListaCantantesFamosos lista){
    	Iterator<CantanteFamoso> it = lista.listaCantantesFamosos.iterator();
    	CantanteFamoso tmpCantante= new CantanteFamoso("", "");
    	while(it.hasNext()){
    		tmpCantante = it.next();
    		System.out.print("Cantante: " + tmpCantante.getNombre());
        	System.out.print("\tDisco más vendido: " + tmpCantante.getDiscoConMasVentas()+"\n");
    	}
    	
    }
}
