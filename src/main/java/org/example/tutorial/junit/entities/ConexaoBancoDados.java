package org.example.tutorial.junit.entities;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConexaoBancoDados {

    public static void iniciarConexao() {
        //fez algo
        log.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        log.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no DB
        log.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no DB
        log.info("removeu dados");
    }

}
