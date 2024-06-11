package br.com.santandercoders.poo;


import br.com.santandercoders.poo.animais.Cachorro;
import br.com.santandercoders.poo.animais.Gato;
import br.com.santandercoders.poo.animais.Passarinho;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Choquito", "Branco", "Feliz", 87, 28, 9.5);
        Gato gato = new Gato("Gatão", "Preto", "Triste", 8.9, 50 );
        Passarinho passaro = new Passarinho("Loro", "Verde", "Neutro", 3.4, 20);

        cachorro1.soar();
        gato.soar();
        passaro.soar();
    }

}