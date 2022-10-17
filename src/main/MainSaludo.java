package main;

import hilos.Saludo;

public class MainSaludo {
    public static void main(String args[]) {
        // Creo un objeto del tipo Saludo
        Saludo miRunnable = new Saludo();
        // Creación de un objeto Thread (hilo (thread) hilo1) pasando como argumento al constructor el objeto Saludo creado
        Thread hilo1 = new Thread(miRunnable);
        // Invocamos el metodo start() del hilo1
        System.out.println("Creando un nuevo hilo desde el hilo principal (main).");
        hilo1.start();
    }
}
