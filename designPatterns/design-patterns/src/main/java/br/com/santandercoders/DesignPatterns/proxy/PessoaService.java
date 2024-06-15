package br.com.santandercoders.DesignPatterns.proxy;

import br.com.santandercoders.DesignPatterns.builder.Pessoa;

public class PessoaService {
    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaService(PessoaRepositoryProxy pessoaRepository){
        this.pessoaRepositoryProxy = pessoaRepository;
    }

    public void save(Pessoa pessoa){
        pessoaRepositoryProxy.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepositoryProxy.findById(id);
    }
}
