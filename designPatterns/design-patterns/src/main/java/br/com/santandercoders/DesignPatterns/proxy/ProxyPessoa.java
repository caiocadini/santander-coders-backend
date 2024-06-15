package br.com.santandercoders.DesignPatterns.proxy;

import br.com.santandercoders.DesignPatterns.builder.Pessoa;

public interface ProxyPessoa {
     void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
