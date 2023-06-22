package ExecutorFramework;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {
    public static void main(String[] args) {
        ThreadPerTaskExecutor executor = new ThreadPerTaskExecutor();

        // i due task vengono eseguiti utilizzando l'executor invocando il metodo execute().
        // L'executor avvierà un nuovo thread per ciascun task, consentendo loro di essere eseguiti in parallelo
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
        new Thread(r).start();
    }
}