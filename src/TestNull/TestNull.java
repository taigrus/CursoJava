package TestNull;

public class TestNull {

    public static void main (String [] Args) {

        ListaNumeros lista1 = new ListaNumeros();
        lista1.aņadirItem(7);
        lista1.aņadirItem(78);

        System.out.println ("El sumatorio actual es: " + lista1.sumatorio() );

    } //Cierre del main

} //Cierre de la clase