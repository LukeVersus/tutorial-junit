package org.example.tutorial.junit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Conta {

    private String numeroConta;

    private Double saldo;

    public void lancaCredito(double valor) {
        this.saldo += valor;
    }

    public void lancaDebito(double valor) {
        this.saldo -= valor;
    }

}
