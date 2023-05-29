import classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 456, "João", 1000, 0.01f);
        ContaCorrente contaCorrente = new ContaCorrente(456, 789, "Maria", 1000, 0.01f, 7.00f);
        ContaCredito contaCredito = new ContaCredito(789, 123, "José", 1000, 0.01f, 7.00f, 1000);

        System.out.println("Teste de polimorfismo com conta de crédito: \n");

        editarConta(contaCredito);

        System.out.println("\nTeste de polimorfismo com conta corrente: \n");

        editarConta(contaCorrente);

        System.out.println("\nTeste de polimorfismo com conta poupança: \n");

        editarConta(contaPoupanca);

    }

    public static void editarConta(ContaPoupanca conta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor a ser depositado: ");
        conta.depositar(scanner.nextFloat());

        conta.extrato();
    }
}