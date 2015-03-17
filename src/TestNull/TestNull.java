package TestNull;

public class TestNull {

    public static void main (String [] Args) {

        ListaNumeros lista1 = new ListaNumeros();
        lista1.añadirItem(7);
        lista1.añadirItem(78);

        System.out.println ("El sumatorio actual es: " + lista1.sumatorio() );

    } //Cierre del main

} //Cierre de la clase