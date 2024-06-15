package br.com.santandercoders.DesignPatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgenda {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");

        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();

        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sábado");

        Constructor<AgendaSingletonEnum> contrutor = AgendaSingletonEnum.class.getDeclaredConstructor();
        contrutor.setAccessible(true);
        AgendaSingletonEnum agendaEnum1 = contrutor.newInstance();
        AgendaSingletonEnum agendaEnum2 = contrutor.newInstance();

        System.out.println(agendaEnum1.hashCode());
        System.out.println(agendaEnum2.hashCode());

    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
