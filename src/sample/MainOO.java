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
        jogador.setApelido("Anita");

        System.out.println("Apelido do Jogador:"+jogador.getApelido());
        computador.sorteia();
        System.out.println("Valor Sorteado:"+computador.getValorAtual());

    }
}
