package ListaProxy.lista.TestPersonal;


import ListaProxy.lista.Lista;

public class ListModifier  implements Runnable {

    private final Lista<Integer> numbers;

    public ListModifier(Lista<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        while (true) {
            // Modifichiamo la lista, aggiungendo un nuovo numero
            int newNumber = (int) (Math.random() * 10) + 1;
            numbers.aggiungi(newNumber);
            System.out.println(Thread.currentThread().getName() + " aggiunge " + newNumber);

            // Attendi un po' prima di aggiungere un altro numero
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}