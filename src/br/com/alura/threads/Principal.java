package br.com.alura.threads;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        ImprimeString imprimeString = new ImprimeString("Pegati, caramba");

        Thread thread = new Thread(imprimeString);
        thread.start();

        Thread.sleep(60000);
    }
}
