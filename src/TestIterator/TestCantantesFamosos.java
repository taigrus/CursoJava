package TestIterator;


import utiles.EntradaDeTexto;

public class TestCantantesFamosos {
	
    public static void main(String[] args){
        ListaCantantesFamosos listaCantantes;
        listaCantantes=new ListaCantantesFamosos();
        listaCantantes.addCantanteFamoso(new CantanteFamoso("Cantante1", "Disco1"));
        listaCantantes.addCantanteFamoso(new CantanteFamoso("Cantante2", "Disco2"));
        listaCantantes.listarCantantes();
        listaCantantes.addFormularioCantanteFamoso();
        listaCantantes.listarCantantes();       
        System.out.print("¿Desea continuar registrando cantantes y discos? (s/n):");
        EntradaDeTexto respuesta = new EntradaDeTexto();
        do{       	
	        if (respuesta.getEntrada().equalsIgnoreCase("S")){
	        	listaCantantes.addFormularioCantanteFamoso();
	        	System.out.print("¿Desea continuar registrando cantantes y discos? (s/n):");
	            respuesta.pedirEntrada();
	        }
        }while(respuesta.getEntrada().equalsIgnoreCase("S"));
        listaCantantes.listarCantantes();        
    }
}
