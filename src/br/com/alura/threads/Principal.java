package br.com.alura.threads;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        String nome = "(Dan|Chad)(\\s|\\w)*";

        Thread threadAssinaturas1  = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
        Thread threadAssinaturas2  = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
        Thread threadAutores  = new Thread(new TarefaBuscaTextual("autores.txt", nome));

        Thread threadAtual = Thread.currentThread();
        long id = threadAtual.getId();
        System.out.println("Id da thread: " + id);


        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();
    }
}
