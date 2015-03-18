package TestNull;

public class TestNull {

    public static void main (String [] Args) {

        ListaNumeros lista1 = new ListaNumeros();
        lista1.addItem(7);
        lista1.addItem(78);
        lista1.addItem(6-1234);

        System.out.println ("El sumatorio actual es: " + lista1.sumatorio() );

    } //Cierre del main

} //Cierre de la clase