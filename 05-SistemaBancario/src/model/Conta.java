package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private Cliente cliente;
    private BigDecimal saldo;
    private LocalDate dataCriacao;


    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = BigDecimal.ZERO;
        this.dataCriacao = LocalDate.now();
    }

    public int getNumero(){
        return numero;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }
    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public void depositar(BigDecimal valor){
        saldo = saldo.add(valor);
    }

    protected void debitar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    }

    public abstract boolean sacar(BigDecimal valor);
}

