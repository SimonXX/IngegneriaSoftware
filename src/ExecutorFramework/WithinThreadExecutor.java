package ExecutorFramework;

import java.util.concurrent.Executor;

public class WithinThreadExecutor implements Executor {
    public static void main(String[] args) {
        WithinThreadExecutor executor = new WithinThreadExecutor();

        //i due task vengono eseguiti utilizzando l'executor invocando il metodo execute().
        // In questo caso l'executor eseguirà direttamente il task chiamando il metodo run() del Runnable
        // sulla stessa chiamata del thread chiamante.
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 in esecuzione");
                // Aggiungi qui il codice del task 1
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 in esecuzione");
                // Aggiungi qui il codice del task 2
            }
        };

        // Esegui i task utilizzando l'executor
        executor.execute(task1);
        executor.execute(task2);
    }

    public void execute(Runnable r) {
        r.run();
    }
}
