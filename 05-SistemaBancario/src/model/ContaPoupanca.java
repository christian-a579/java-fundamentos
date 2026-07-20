package model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(BigDecimal valor) {

        if (getSaldo().compareTo(valor) >= 0) {
            debitar(valor);
            return true;
        }

        return false;
    }
}