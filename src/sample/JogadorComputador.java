package sample;

import java.util.Random;

public class JogadorComputador {

    //atributos
    boolean ehPar;
    int valorAtual;
    int[] escolhas;

    //metodos
    public void sorteia(){
        Random rnd = new Random(System.currentTimeMillis());

        valorAtual = rnd.nextInt(11);
    }
}
