import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Scanner leitor = new Scanner(System.in);
        double saldo = 0;
        System.out.println("BEM VINDO AO CAIXA ELETRÔNICO");
        System.out.println("Primeiro, dê os nomes aos bois!");
        System.out.println("Modelo:");
        caixa.modelo = leitor.nextLine();
        System.out.println("Tamanho:");
        caixa.tamanho = leitor.nextLine();
        System.out.println("Quantidade de teclas: ");
        caixa.quantidadeTeclas = leitor.nextInt();
        System.out.println("Visor: ");
        caixa.visor = leitor.nextLine();
        System.out.println("Saque por segundo: ");
        caixa.saquePorSegundo = leitor.nextFloat();

        while (true) {
            System.out.println("Qual opção você deseja selecionar?:");
            System.out.println("[1] Depósito");
            System.out.println("[2] Saque");
            System.out.println("[3] Imprimir saldo");
            System.out.println("[4] Sair");
            int escolha = leitor.nextInt();
            if (escolha == 1) {
                saldo = Caixa.depositarDinheiro(saldo);
            } else if (escolha == 2) {
                System.out.print("Qual é o valor que você deseja sacar?: ");
                double saque = leitor.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente para o saque.");
                } else {
                    saldo = Caixa.sacarDinheiro(saldo, saque);
                }
            } else if (escolha == 3) {
                Caixa.imprimirSaldo(saldo);
            } else if (escolha == 4) {
                System.out.println("Saindo do caixa eletrônico. Até logo!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            Caixa caixa2 = new Caixa("abcddfefefe", "1 metro e meio",
                                    12, "Alto contraste", 12.2f);

            System.out.print(caixa2.modelo);
        }
    }
}