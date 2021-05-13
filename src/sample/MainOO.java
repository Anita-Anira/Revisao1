package sample;

public class MainOO {

    public static void  main(String[] args){

        //declaraçoes
        JogadorHumano jogador;
        JogadorComputador computador;

        //instanciar
        jogador = new JogadorHumano();
        computador = new JogadorComputador();

        //inicializar
        jogador.apelido = "Anita";

        System.out.println("Apelido do Jogador:"+jogador.apelido);
        computador.sorteia();
        System.out.println("valor sorteado:"+computador.valorAtual);
    }
}
