package br.com.santandercoders.DesignPatterns.proxy;

import java.util.HashMap;
import java.util.Map;

import br.com.santandercoders.DesignPatterns.builder.Pessoa;

public class PessoaRepository {
    private Map<Long, Pessoa> banco = new HashMap<>();

    private static long countId = 1L;


    public void save(Pessoa pessoa){
        banco.put(countId++, pessoa);
    }

    public Pessoa findById(Long id){
        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }

}
