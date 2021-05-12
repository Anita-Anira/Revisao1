package sample;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int opcaoComputador(){
        Random rnd = new Random(System.currentTimeMillis());

        int valor = rnd.nextInt(11);

        return valor;
    }

    public static String verificaQuemGanhou(boolean usuarioPar, int valorUsuario, int valorComputador) {

        int soma = valorUsuario + valorComputador;

        if ((soma % 2 == 0) && usuarioPar) {

            return "Usuario";
        } else if ((soma % 2 == 1) && !usuarioPar) {
            return "Usuario";
        }
        return "Computador";
    }
    public static void main(String[] args){
        int opComp = opcaoComputador();
        System.out.println(opComp);
      //  System.exit(1);

        int MAX_JOGADAS = 3;

        Scanner scan = new Scanner(System.in);

        boolean usuarioPar = false;
        int valorUsuario = 0;
        boolean continuar=true;
        int jogada = 0;

        int[] escolhaUsuario;
        int[] escolhaComputador;

        escolhaUsuario = new int[MAX_JOGADAS];
        escolhaComputador = new int[MAX_JOGADAS];

        while(continuar && jogada < MAX_JOGADAS){
            System.out.println("VOCÊ QUER SER PAR? 1 - SIM | 0- NÃO");
            int res = scan.nextInt();

            if (res == 1) {
                usuarioPar = true;

            } else if (res == 0) {
                usuarioPar = false;

            } else {
                System.out.println("OPÇÃO INVÁLIDA!");
                System.exit(1);
            }

            System.out.println("ESCOLHA UM NUMERO DE 0 A 10:");
            valorUsuario = scan.nextInt();

            if (valorUsuario < 0 || valorUsuario > 10) {
                System.out.println("VALOR INVÁLIDO!");
                System.exit(1);
            }


            // System.out.println(usuarioPar+" "+valorUsuario+ " "+opComp);

            String ganhador = verificaQuemGanhou(usuarioPar, valorUsuario, opComp);

            escolhaUsuario[jogada] = valorUsuario;
            escolhaComputador[jogada] = opComp;

            jogada+=1;
            System.out.println(ganhador);
            System.out.println("VOCÊ QUER CONTINUAR? 1- SIM - 0- NÃO");
            continuar = scan.nextInt() == 1;

        }

        for(int i=0; i<escolhaUsuario.length; i++){
            System.out.println("J: "+escolhaUsuario[i]+ "C: "+escolhaComputador[i]);
        }
    }

}