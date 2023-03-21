package org.example.tutorial.junit.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 100.0);
        Conta contaDestino = new Conta("456548", 50.0);

        TransferenciaConta transferenciaEntreContas = new TransferenciaConta();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20.0));
    }

}
