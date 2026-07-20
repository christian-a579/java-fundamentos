package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import model.Conta;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void cadastroConta (Conta conta){
        Conta contaExistente = buscarConta(conta.getNumero());

        if (contaExistente != null) {
            System.out.println("Já existe uma conta com esse número.");
            return;
        }
        contas.add(conta);
    }

    public Conta buscarConta(int numero){
        for (Conta conta : contas){
            if (conta.getNumero() == numero) {
                return conta;
            }
        } return null;
    }

    public void listarContas(){
        for (Conta conta : contas){
            System.out.println(
                    "Conta: " + conta.getNumero() +
                            " | Cliente: " + conta.getCliente().getNome() +
                            " | Saldo: " + conta.getSaldo()
            );
        }
    }

    public void depositar (int numeroConta, BigDecimal valor) {
        Conta conta = buscarConta(numeroConta);

        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void sacar (int numeroConta, BigDecimal valor){
        Conta conta = buscarConta(numeroConta);

        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void transferir (int numeroContaOrigem,
                            int numeroContaDestino,
                            BigDecimal valor){
        Conta contaOrigem = buscarConta(numeroContaOrigem);
        Conta contaDestino = buscarConta(numeroContaDestino);

        if(contaOrigem != null && contaDestino != null){
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}