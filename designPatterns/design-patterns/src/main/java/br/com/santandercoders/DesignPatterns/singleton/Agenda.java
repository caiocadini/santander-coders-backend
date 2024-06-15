package br.com.santandercoders.DesignPatterns.singleton;

import java.util.LinkedHashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Boolean> dias = new LinkedHashMap<>();

    public Agenda(){
        dias.put("Domingo", Boolean.TRUE);
        dias.put("Segunda", Boolean.TRUE);
        dias.put("Terça", Boolean.TRUE);
        dias.put("Quarta", Boolean.TRUE);
        dias.put("Quinta", Boolean.TRUE);
        dias.put("Sexta", Boolean.TRUE);
        dias.put("Sábado", Boolean.TRUE);

    }

    public Map<String, Boolean> getDias(){
        return dias;
    }

    public void ocupa(String dia){
        dias.replace(dia, Boolean.FALSE);
    }
}
