package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.implementation.SupermercadoVetor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static int SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupermercadoVetor supermercado = new SupermercadoVetor(SIZE);
        int opcao;
        do{
            System.out.println("\nLista de Compras");
            System.out.println("1-Inserir");
            System.out.println("2-Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido:");
                    String item = scanner.next();
                    supermercado.add(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido");
                    int index = scanner.nextInt();
                    supermercado.deleteItem(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente");
            }
        } while (opcao != 4);

        scanner.close();
    }
}