package app;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import service.Banco;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;

        do {
            System.out.println("\n===== BANCO JAVA =====");
            System.out.println("1 - Criar conta-corrente");
            System.out.println("2 - Criar conta-poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch(opcao){

                case 1: {

                    System.out.println("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite seu nome: ");
                    String nomeUser = scanner.nextLine();

                    System.out.println("Digite seu CPF: ");
                    String cpfUser = scanner.nextLine();

                    Cliente cliente = new Cliente(nomeUser, cpfUser);
                    ContaCorrente contaCorrente =
                            new ContaCorrente(numeroConta, cliente);

                    banco.cadastroConta(contaCorrente);

                    break;
                }

                case 2: {

                    System.out.println("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite seu nome: ");
                    String nomeUser = scanner.nextLine();

                    System.out.println("Digite seu CPF: ");
                    String cpfUser = scanner.nextLine();

                    Cliente cliente = new Cliente(nomeUser, cpfUser);
                    ContaPoupanca contaPoupanca =
                            new ContaPoupanca(numeroConta, cliente);

                    banco.cadastroConta(contaPoupanca);

                    break;
                }

                case 3: {

                    System.out.println("Digite o numero da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o valor: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    scanner.nextLine();

                    banco.depositar(numeroConta, valor);

                    break;
                }

                case 4: {

                    System.out.println("Digite o numero da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o valor: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    scanner.nextLine();

                    banco.sacar(numeroConta, valor);

                    break;
                }

                case 5: {

                    System.out.println("Digite o numero da sua conta: ");
                    int numeroContaOrigem = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o numero da conta do destinatario: ");
                    int numeroContaDestino = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o valor: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    scanner.nextLine();

                    banco.transferir(numeroContaOrigem, numeroContaDestino, valor);

                    break;
                }

                case 6: {

                    banco.listarContas();

                    break;

                }
                case 0:

                    System.out.println("Encerrando...");
                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

        scanner.close();
    }
}