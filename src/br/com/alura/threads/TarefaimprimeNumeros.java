package br.com.alura.threads;

public class TarefaimprimeNumeros  implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            Thread threadAtual = Thread.currentThread();
            System.out.println(threadAtual.getId() + " - " + i);
        }
    }
}
