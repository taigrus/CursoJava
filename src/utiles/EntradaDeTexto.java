package utiles;

import java.util.Scanner;

public class EntradaDeTexto{
    
    private String entradaTeclado;
    
    public EntradaDeTexto(){
        entradaTeclado="";
        pedirEntrada();
    }
    
    public void pedirEntrada(){
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado=entradaEscaner.nextLine();
    }
    
    public String getEntrada(){return entradaTeclado;}
    public String getPrimeraPalabra(){
        for (int i=0; i< entradaTeclado.length()-1;i++){
            if(entradaTeclado.substring(i,i+1).equals(" ")){
                return entradaTeclado.substring(0,i+1);
            }
        }
        return entradaTeclado;
    }
    
    public String getTextoMayusculas(){
        return entradaTeclado.toUpperCase();
    }
    
    public String getTextoCapitalizado(){
        if (entradaTeclado.equals("") || entradaTeclado == null){
            return "null";
        }else
        {
        	entradaTeclado = entradaTeclado.toLowerCase();
            String caracterActual=entradaTeclado.substring(0,1);
            String cadenaCapitalizada=caracterActual.toUpperCase();
            for (int i=1; i< entradaTeclado.length();i++){
                caracterActual=entradaTeclado.substring(i,i+1);
                if(caracterActual.equals(" ")){
                    cadenaCapitalizada=cadenaCapitalizada+caracterActual;
                    i++;
                    caracterActual=entradaTeclado.substring(i,i+1);
                    cadenaCapitalizada=cadenaCapitalizada+caracterActual.toUpperCase();
                }else{
                    cadenaCapitalizada=cadenaCapitalizada+caracterActual;
                }          
            }
            return cadenaCapitalizada;
        }
    }    
    public int getLongitud(){
        return entradaTeclado.length();
    }
}
