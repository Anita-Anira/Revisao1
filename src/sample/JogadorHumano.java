package sample;

public class JogadorHumano {
    //atributos
    private String apelido;
    private boolean ehPar;
    private int valorAtual;
    private int[] escolhas;


    //metodos

    public  JogadorHumano(String apelido, int max_jogadas){
        this.apelido = apelido;
        escolhas = new int[max_jogadas];

    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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
