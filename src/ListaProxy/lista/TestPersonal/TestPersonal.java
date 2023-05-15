package ListaProxy.lista.TestPersonal;

import ListaProxy.lista.Lista;
import ListaProxy.lista.Liste;

public class TestPersonal {

    public static void main(String[] args){

        Lista<Integer> lista = Liste.creaLista(5, true);

        lista.aggiungi(4);
        lista.aggiungi(5);

        Thread thread1 = new Thread(new ListReader(lista.copia()));
        Thread thread2 = new Thread(new ListReader(lista.copia()));
        Thread thread3 = new Thread(new ListModifier(lista.copia()));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(lista);


    }
}
