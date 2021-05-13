package sample;
import java.util.Scanner;

public class MainOO {

    public static void  main(String[] args){

        int MAX_JOGADAS=3;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        int leitura;
        int jogada = 0;

        //declaraçoes
        JogadorHumano jogador;
        JogadorComputador computador;
        Juiz juiz;

        //instanciar
        jogador = new JogadorHumano("Anita", MAX_JOGADAS);
        computador = new JogadorComputador(MAX_JOGADAS);
        juiz = new Juiz();

        //inicializar

        while(continuar && jogada < MAX_JOGADAS) {

            System.out.println("PAR OU IMPAR? (1- PAR 0- IMPAR)");
            leitura = scan.nextInt();
            if(leitura != 1 && leitura != 0){
                System.out.println("OPÇÃO INVALIDA!");
            }

            jogador.setEhPar(leitura==1);
            System.out.println("DIGITE UM NUMERO DE 0 A 10:");
            leitura = scan.nextInt();

            if(leitura < 0 || leitura > 10){
                System.out.println("OPÇÃO INVALIDA!");
                System.exit(1);
            }

            jogador.registrarJogada(leitura, jogada);

            computador.registraJogada(jogada);

            String resultado = juiz.verificaQuemGanhou(jogador, computador);

            System.out.println("J:"+jogador.getValorAtual()+"C"+computador.getValorAtual());
            System.out.println(resultado);

            System.out.println("VOCÊ QUER CONTINUAR? 1- SIM - 0- NÃO");
            continuar = scan.nextInt() == 1;
            jogada +=1;
        }

        int[] escolhasJogador = jogador.getEscolhas();
        int[] escolhasComputador = computador.getEscolhas();

        for(int i=0; i<jogada; i++){
            System.out.println("J:"+jogador.getEscolhas()[i]+" C:"+escolhasComputador[i]);

        }
    }
}
