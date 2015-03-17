package TestIterator;


import utiles.EntradaDeTexto;

public class TestCantantesFamosos {
	
    public static void main(String[] args){
        ListaCantantesFamosos listaCantantes;
        listaCantantes=new ListaCantantesFamosos();
        listaCantantes.addCantanteFamoso(new CantanteFamoso("Cantante1", "Disco1"));
        listaCantantes.addCantanteFamoso(new CantanteFamoso("Cantante2", "Disco2"));
        listaCantantes.listarCantantes();
        EntradaDeTexto nombre,disco;
        System.out.println("Ingrese un nuevo cantane: ");
        nombre = new EntradaDeTexto();
        System.out.println("Ingrese un nombre de disco para el cantante: ");
        disco = new EntradaDeTexto();
        listaCantantes.addCantanteFamoso(new CantanteFamoso(nombre.getTextoCapitalizado(),disco.getTextoCapitalizado()));
        listaCantantes.listarCantantes();       
        System.out.println("¿Desea continuar registrando cantantes y discos? (s/n):");
        EntradaDeTexto respuesta = new EntradaDeTexto();
        do{       	
	        if (respuesta.getEntrada().equalsIgnoreCase("S")){
	        	System.out.println("Ingrese el nombre de un nuevo cantane: ");
	        	nombre.pedirEntrada();
	        	System.out.println("Ingrese el nombre de un nuevo disco para este cantante: ");
	        	disco.pedirEntrada();
	        	listaCantantes.addCantanteFamoso(new CantanteFamoso(nombre.getTextoCapitalizado(), disco.getTextoCapitalizado()));
	        	System.out.println("¿Desea continuar registrando cantantes y discos? (s/n):");
	            respuesta.pedirEntrada();
	        }
        }while(respuesta.getEntrada().equalsIgnoreCase("S"));
        listaCantantes.listarCantantes();        
    }
}
