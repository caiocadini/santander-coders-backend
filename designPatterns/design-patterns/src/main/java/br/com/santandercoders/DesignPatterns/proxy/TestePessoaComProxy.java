package br.com.santandercoders.DesignPatterns.proxy;

import br.com.santandercoders.DesignPatterns.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComProxy {
    public static void main(String[] args){
        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

        Pessoa pessoa = new Pessoa.PessoaBuilder().sobrenome("Cadini1").dataNascimento(LocalDate.of(2003, 12, 12))
                .nome("Caio1").apelido("caio").email("caio@g.com").documento("pdf").build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornada1 = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
    }
}
