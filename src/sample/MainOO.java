package sample;

public class MainOO {

    public static void  main(String[] args){

        int MAX_JOGADAS=3;

        //declaraçoes
        JogadorHumano jogador;
        JogadorComputador computador;

        //instanciar
        jogador = new JogadorHumano("Anita", MAX_JOGADAS);
        computador = new JogadorComputador(MAX_JOGADAS);

        //inicializar

        System.out.println("Apelido do Jogador:"+jogador.getApelido());
        computador.sorteia();
        System.out.println("Valor Sorteado:"+computador.getValorAtual());

    }
}
