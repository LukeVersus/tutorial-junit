package org.example.tutorial.junit.entities;

public class TransferenciaConta {
    public void transfere(Conta contaOrigem, Conta contaDestino, double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
