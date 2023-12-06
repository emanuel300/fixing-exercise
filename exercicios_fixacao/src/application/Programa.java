package application;
import entity.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Conta conta;

        System.out.println("Numero da conta: ");
        int number = ler.nextInt();

        System.out.println("Nome de usuario: ");
        ler.nextLine();
        String nome = ler.nextLine();

        System.out.println("Realizar deposito inicial (Y/N): ");
        char response = ler.next().charAt(0);
        if (response == 'y'){
            System.out.println("Qual valor para deposito: ");
            double inicial = ler.nextDouble();
            conta = new Conta(number, nome, inicial);
        }
        else{
            conta = new Conta(number, nome);
        }


        System.out.println();
        System.out.println("Dados da Conta");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor pra deposito: ");
        double depositoValor = ler.nextDouble();
        conta.deposito(depositoValor);
        System.out.println("Dados da conta atualizado");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor para retirar: ");
        double retiradaValor = ler.nextDouble();
        conta.saldoRetirada(retiradaValor);
        System.out.println("Dados da conta atualizado");
        System.out.println(conta);







        ler.close();
    }
}