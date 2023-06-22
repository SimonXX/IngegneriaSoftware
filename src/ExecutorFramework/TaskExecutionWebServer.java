package ExecutorFramework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskExecutionWebServer {

    //L'executor si occuperà di assegnare i task ai thread disponibili nel thread pool.
    // I task verranno eseguiti in parallelo in base alla disponibilità dei thread
    private static final int NTHREADS = 100;
    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                public void run() {
                    handleRequest(connection);
                }
            };
            exec.execute(task);
        }
    }

    private static void handleRequest(Socket connection) {
        // Codice per gestire la richiesta del client
        // ...
        // Esempio: stampa l'indirizzo IP del client
        System.out.println("Richiesta ricevuta da: " + connection.getInetAddress().getHostAddress());
    }
}
