package teste_parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Projeto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Isso é uma lista de nomes femininos.");

        while (true) {
            System.out.println("Se deseja parar, digite 'p'; caso contrário, digite o nome:");
            String nome = ler.nextLine();

            if (nome.equalsIgnoreCase("p")) {
                System.out.println("Até a próxima!");
                break;
            }

            pessoas.add(new Pessoa(nome, 'F'));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .collect(Collectors.toList());

        System.out.println("\nMulheres:\n");
        IntStream.range(0, mulheres.size())
                .forEach(index -> System.out.println((index + 1) + ". " + mulheres.get(index).getNome()));
    }
}