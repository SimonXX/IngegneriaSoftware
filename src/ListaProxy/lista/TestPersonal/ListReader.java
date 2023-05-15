package ListaProxy.lista.TestPersonal;


import ListaProxy.lista.Lista;

public class ListReader implements Runnable {

    private final Lista<Integer> numbers;

    public ListReader(Lista<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {

        while(true){
            for(int i =0; i< numbers.size(); i++){
                System.out.println(Thread.currentThread().getName() + " legge " + numbers.dammiElemento(i));
            }

        }

    }
}