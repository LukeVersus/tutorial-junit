package org.example.tutorial.junit.entities;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class AfterBeforeTest {

    @BeforeAll
    static void configuraConexao() {
        ConexaoBancoDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        ConexaoBancoDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        ConexaoBancoDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        ConexaoBancoDados.finalizarConexao();
    }

}
