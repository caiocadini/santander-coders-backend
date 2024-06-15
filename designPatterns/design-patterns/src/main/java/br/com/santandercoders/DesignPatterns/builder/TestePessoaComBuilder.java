package br.com.santandercoders.DesignPatterns.builder;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main (String[] args){
        Pessoa pessoaTeste = new Pessoa.PessoaBuilder().nome("Caio")
                 .sobrenome("Cadini")
                 .documento("cpf")
                 .email("caio@gmail.com")
                 .apelido("caio")
                 .dataNascimento(LocalDate.of(2003, 12, 12 ))
                 .build();

        System.out.println(pessoaTeste.toString());
    }
}
