package teste_parte1;


import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util
import java.util.List; // Importa a classe List do pacote java.util
import java.io.ByteArrayInputStream; // Importa a classe ByteArrayInputStream do pacote java.io
import java.io.InputStream; // Importa a classe InputStream do pacote java.io

import org.junit.Test; // Importa a anotação Test do pacote org.junit

public class ProjetoTest {

    @Test // Anotação que marca o método como um teste a ser executado pelo JUnit
    public void testListaContemApenasMulheres() {
        List<Pessoa> pessoas = new ArrayList<>(); // Cria uma lista vazia de objetos Pessoa
        pessoas.add(new Pessoa("Maria", 'F')); // Adiciona uma pessoa do sexo feminino à lista
        pessoas.add(new Pessoa("João", 'M')); // Adiciona uma pessoa do sexo masculino à lista
        pessoas.add(new Pessoa("Ana", 'F')); // Adiciona uma pessoa do sexo feminino à lista
        pessoas.add(new Pessoa("Pedro", 'M')); // Adiciona uma pessoa do sexo masculino à lista

        boolean contemApenasMulheres = pessoas.stream() // Verifica se a lista contém apenas pessoas do sexo feminino
                .allMatch(pessoa -> pessoa.getGen() == 'F');

        // Método para imprimir a lista de pessoas
        imprimirListaPessoas(pessoas);
    }

    @Test // Anotação que marca o método como um teste a ser executado pelo JUnit
    public void testLista() {
        String input = "Ana\nMaria\np\n"; // Cria uma string com entradas para simular a entrada do usuário
        InputStream in = new ByteArrayInputStream(input.getBytes()); // Cria um novo fluxo de entrada com a string de entrada
        System.setIn(in); // Redireciona a entrada do sistema para o novo fluxo de entrada

        Projeto.main(new String[]{}); // Chama o método main da classe Projeto com um array vazio de argumentos
    }

    // Método para imprimir a lista de pessoas
    private void imprimirListaPessoas(List<Pessoa> pessoas) {
        System.out.println("Lista de Pessoas:"); // Imprime uma mensagem indicando o início da lista de pessoas
        for (Pessoa pessoa : pessoas) { // Loop que percorre a lista de pessoas
            System.out.println(pessoa.getNome() + " - " + pessoa.getGen()); // Imprime o nome e o gênero de cada pessoa na lista
        }
    }
}