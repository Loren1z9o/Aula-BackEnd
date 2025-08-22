import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomes = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur", "Eevee", "Jigglypuff", "Snorlax", "Gengar", "Machop", "Dratini"};


        String[] tipos = {"Elétrico", "Fogo", "Água", "Planta", "Normal", "Voador", "Fantasma", "Lutador", "Dragão", "Psíquico"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Quantos Pokémon você deseja gerar? ");
        int quantidade = scanner.nextInt();

        System.out.println();


        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(100) + 1;

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
        }

        scanner.close();
    }
}
