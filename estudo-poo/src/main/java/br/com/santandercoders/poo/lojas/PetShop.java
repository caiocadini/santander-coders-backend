package br.com.santandercoders.poo.lojas;

import br.com.santandercoders.poo.animais.Animal;
import br.com.santandercoders.poo.animais.Cachorro;

public class PetShop {

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }
    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudade");
    }
}
