package org.example;

import java.util.Random;
import java.util.Scanner;

public class GeradorDePokemon {

    public static void main(String[] args) {

        String[] nomes = {"Pikachu", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon",
                "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie",
                "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
                "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate",
                "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
                "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina",
                "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy",
                "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff",
                "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume",
                "Paras", "Parasect", "Venonat", "Venomoth", "Diglett",
                "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck",
                "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag",
                "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam",
                "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell",
                "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler",
                "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro",
                "Magnemite", "Magneton", "Farfetch’d", "Doduo", "Dodrio",
                "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
                "Cloyster", "Gastly", "Haunter", "Gengar", "Onix",
                "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb"};


        String[] tipos = {
                "Normal",
                "Fogo",
                "Água",
                "Grama",       // ou "Planta"
                "Elétrico",
                "Gelo",
                "Lutador",
                "Venenoso",
                "Terrestre",
                "Voador",
                "Psíquico",
                "Inseto",
                "Pedra",
                "Fantasma",
                "Dragão",
                "Noturno",
                "Metálico",    // ou "Aço"
                "Fada"
        };


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
