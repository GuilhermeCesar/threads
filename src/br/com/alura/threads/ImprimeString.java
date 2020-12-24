package br.com.alura.threads;

public class ImprimeString implements Runnable{

    private String mensagem;

    public ImprimeString(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        System.out.println(mensagem);
    }
}
