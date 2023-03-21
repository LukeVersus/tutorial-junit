package org.example.tutorial.junit.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Júlia", LocalDate.of(2020,1,11));
        Assertions.assertEquals(3, pessoa.getIdade());
    }

    @Test
    void validarBooleanMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Jéssica", LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa.maiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.of(2020,1,1));
        Assertions.assertFalse(joao.maiorDeIdade());
    }

}
