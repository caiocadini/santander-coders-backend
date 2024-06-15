package br.com.santandercoders.DesignPatterns.proxy;

import br.com.santandercoders.DesignPatterns.builder.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
    private Map<Long, Pessoa> cache = new HashMap<>();
    @Override
    public void save(Pessoa pessoa){
        log.info("Iniciando método save");
        super.save(pessoa);
        log.info("Finalizando método save");
    }

    @Override
    public Pessoa findById(Long id){
        log.info("Iniciando método getById");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if (Objects.nonNull(cache.get(id))){
            log.info("Pegando info do cache");
            pessoa = cache.get(id);
        }else{
            log.info("Pegando info do PessoaRepository");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        long fim = System.currentTimeMillis();
        log.info("Finalizando método getById");
        log.info("Tempo gasto na chamada: "+ (fim - inicio));
        return pessoa;

    }
}
