import java.util.Scanner;

public class Caixa {

    public String modelo;
    public String tamanho;
    public int quantidadeTeclas;
    public String visor;
    public float saquePorSegundo;

    public static double sacarDinheiro(double valorAtual, double dinheiroSacado) {
        return valorAtual - dinheiroSacado;
    }

    public static double depositarDinheiro(double valorAtual) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor que você deseja depositar?: ");
        double valor = leitor.nextDouble();
        return valorAtual + valor;
    }

    public static void imprimirSaldo(double valorAtual) {
        System.out.println("O seu saldo atual é: " + valorAtual);
    }
    public Caixa(){
        this.modelo = "";
        this.tamanho = "";
        this.quantidadeTeclas = 0;
        this.visor = "";
        this.saquePorSegundo = 0f;
    }
    public Caixa(String modelo, String tamanho, int teclas, String visor, float saques){
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.quantidadeTeclas = teclas;
        this.visor = visor;
        this.saquePorSegundo = saques;
    }
}
