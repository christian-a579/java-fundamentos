package model;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(BigDecimal valor) {
        BigDecimal taxa = BigDecimal.valueOf(5);
        BigDecimal total = valor.add(taxa);

        if (getSaldo().compareTo(total) >= 0) {
            debitar(total);
            return true;
        }

        return false;
    }
}