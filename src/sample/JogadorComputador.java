package sample;

import java.util.Random;

public class JogadorComputador {

    //atributos
    private boolean ehPar;
    private int valorAtual;
    private int[] escolhas;

    //metodos

    public void sorteia(){
        Random rnd = new Random(System.currentTimeMillis());

        valorAtual = rnd.nextInt(11);
    }

    public boolean isEhPar() {
        return ehPar;
    }

    public void setEhPar(boolean ehPar) {
        this.ehPar = ehPar;
    }

    public int getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public int[] getEscolhas() {
        return escolhas;
    }

}
