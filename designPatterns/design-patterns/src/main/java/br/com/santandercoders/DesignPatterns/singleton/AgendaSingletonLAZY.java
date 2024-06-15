package br.com.santandercoders.DesignPatterns.singleton;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

        private static AgendaSingletonLAZY INSTANCE = null;
        private Map<String, Boolean> dias = new LinkedHashMap<>();

        private AgendaSingletonLAZY(){
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

        public static AgendaSingletonLAZY getInstance(){
            if (Objects.isNull(INSTANCE)){
                INSTANCE = new AgendaSingletonLAZY();
                return INSTANCE;
            }
            return INSTANCE;
        }
}

