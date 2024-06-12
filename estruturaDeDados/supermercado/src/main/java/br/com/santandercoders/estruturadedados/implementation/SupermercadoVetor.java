package br.com.santandercoders.estruturadedados.implementation;

public class SupermercadoVetor implements Supermercado{

    private final String[] items;
    private int lastIndex;

    /*MÉTODOS*/

    public SupermercadoVetor(int tamVetor) {
        items = new String[tamVetor];
        lastIndex = -1;
    }

    @Override
    public void add(final String item) {
        if(lastIndex == items.length-1){
            System.out.println("Impossível inserir item. Lista cheia");
        } else{
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        if(lastIndex<0){
            System.out.println("Lista de supermercado vazia");
        }

        for(int i = 0; i<=lastIndex; i++){
            System.out.println("item "+ (i+1) + ": " + items[i]);
        }

    }

    @Override
    public void deleteItem(final int index) {
        if(index-1 >= 0 && index-1 <= lastIndex){
            shift(index-1);
            lastIndex--;
        } else{
            System.out.println("Índice Inválido");
        }
    }

    private void shift(final int index){
        for(int i = index; i < lastIndex; i++){
            items[i] = items[i+1];
        }
    }
}
