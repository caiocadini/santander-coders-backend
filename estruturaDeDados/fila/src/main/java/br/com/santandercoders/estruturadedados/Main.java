package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.fila.Fila;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Fila fila = new Fila("Cliente " + cliente);
        System.out.println("Chegou o cliente: " + cliente);

        for (int i = 2; i <= n; i++){
            cliente = random.nextInt(101);
            fila.enqueue("Cliente " + cliente);
            System.out.println("Cheogu o cliente: " + cliente);
        }

        //Atendimento
        for (int i = 0; i < n; i++){
            System.out.println("Atendido " + fila.dequeue().getNodeData());
        }
        //Teste para conferir se a fila ficou vazia
        fila.print();
    }
}