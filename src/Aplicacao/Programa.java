package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Usuario;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Usuario usuario;

        // Solicita ao usuário o número da conta
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        // Solicita ao usuário o nome do titular da conta
        System.out.print("Digite o nome de usuário: ");
        sc.nextLine(); // Consome a nova linha pendente do input anterior
        String nome = sc.nextLine();

        // Cria um novo objeto Usuario com base na resposta do usuário
        System.out.print("Deseja fazer um depósito inicial? (y/n)? ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("y")) { // Compara a resposta corretamente
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            usuario = new Usuario(numero, nome, depositoInicial); // Cria um usuário com depósito inicial
        }
        else {
            usuario = new Usuario(numero, nome);
        }

        // Exibe os dados da conta do usuário
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(usuario);

        // Solicita o valor do novo depósito
        System.out.println();
        System.out.print("Digite o novo valor de depósito: ");
        double valorDoDeposito = sc.nextDouble();
        usuario.deposito(valorDoDeposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(usuario);

        // Solicita o valor do saque
        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double valorDoSaque = sc.nextDouble();
        usuario.saque(valorDoSaque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(usuario);

        sc.close();
    }
}