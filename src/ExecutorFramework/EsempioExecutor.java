package ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class EsempioExecutor {
    public static void main(String[] args) {
        // Crea un executor di tipo thread pool con un numero fisso di thread
        Executor executor = Executors.newFixedThreadPool(3);

        // Definisci una serie di task rappresentati da oggetti Runnable
        Runnable task1 = () -> {
            System.out.println("Task 1 in esecuzione");
            // Simulazione di un lavoro lungo
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 completato");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 in esecuzione");
            // Simulazione di un lavoro lungo
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completato");
        };

        //se non volessimo usare lambda expression

//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Task 2 in esecuzione");
//                // Simulazione di un lavoro lungo
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Task 2 completato");
//            }
//        };



        Runnable task3 = () -> {
            System.out.println("Task 3 in esecuzione");
            // Simulazione di un lavoro lungo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 3 completato");
        };

        // Esegui i task utilizzando l'executor
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
    }
}
