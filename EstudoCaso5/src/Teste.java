import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Adicionando elementos à lista
        listaDeNomes.add("João");
        listaDeNomes.add("Maria");
        listaDeNomes.add("Pedro");

        // Acessando elementos da lista
        System.out.println("Elemento na posição 0: " + listaDeNomes.get(0));
        System.out.println("Elemento na posição 1: " + listaDeNomes.get(1));
        System.out.println("Elemento na posição 2: " + listaDeNomes.get(2));

        // Iterando sobre os elementos da lista
        System.out.println("Elementos da lista:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Removendo um elemento da lista
        listaDeNomes.remove("Maria");
        System.out.println("Após remover 'Maria', a lista fica:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeNomes.size());

        // Verificando se a lista está vazia
        System.out.println("A lista está vazia? " + listaDeNomes.isEmpty());
    }
}

