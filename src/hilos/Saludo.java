package hilos;
// implemento la interfaz Runnable
public class Saludo implements Runnable {

    // Es necesario sobreescribir el metodo run con el comportamiento deseado
    @Override
    public void run() {
        System.out.println("Hilo creado desde la interfaz Runnable!!");
    }
}
