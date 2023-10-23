package teste_parte1;

class Pessoa implements Comparable<Pessoa> { // Classe Pessoa que implementa a interface Comparable com tipo Pessoa

    private String nome; // Declaração de variável de instância de String para o nome
    private char gen; // Declaração de variável de instância de char para o gênero

    public Pessoa(String nome, char gen) { // Construtor da classe Pessoa que aceita um nome e um gênero como parâmetros
        this.nome = nome; // Inicializa o nome com o valor fornecido
        this.gen = gen; // Inicializa o gênero com o valor fornecido
    }

    public String getNome() { // Método para obter o nome da Pessoa
        return nome; // Retorna o nome da Pessoa
    }

    public char getGen() { // Método para obter o gênero da Pessoa
        return gen; // Retorna o gênero da Pessoa
    }

    @Override
    public int compareTo(Pessoa o) { // Método para comparar Pessoas com base no nome
        return this.nome.compareTo(o.getNome()); // Compara os nomes e retorna o resultado da comparação
    }
}