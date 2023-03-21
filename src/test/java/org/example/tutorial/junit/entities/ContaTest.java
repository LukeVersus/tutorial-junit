package org.example.tutorial.junit.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    void validaSaldo() {
        Conta conta = new Conta("123456", 100.0);
        Assertions.assertNotNull(conta);

        conta.lancaCredito(50.0);

        Assertions.assertEquals(150.0, conta.getSaldo());

        conta.lancaDebito(50.0);

        Assertions.assertEquals(100.0, conta.getSaldo());

        Assertions.assertNotEquals(101.0, conta.getSaldo());

        conta = null;
        Assertions.assertNull(conta);
    }

}
