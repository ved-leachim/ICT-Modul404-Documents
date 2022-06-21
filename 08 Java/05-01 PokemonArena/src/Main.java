import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static Scanner scr = new Scanner(System.in);
    public static String[] starterPokemons = new String[] {"Pikachu", "Bisasam", "Glumanda", "Schiggi", "Habitak", "Miauzi"};
    public static int trainerCount;

    public static void main(String[] args) {
        String[][] trainerAndPokemon = trainer();
        trainerAndPokemon = assignPokemon(trainerAndPokemon);
        showAssignments(trainerAndPokemon);
    }

    public static String[][] trainer() {
        System.out.println("How many Trainers are there?");
        trainerCount = Integer.parseInt(scr.nextLine());
        String[][] trainerAndPokemon = new String[trainerCount][2];

        for (int i = 0; i <= trainerCount -1; i++) {
            trainerAndPokemon[i][0] = trainerName(i);
        }
        return trainerAndPokemon;
    }

    public static String trainerName(int trainerNumber) {
        System.out.println("What is the name of trainer Nr. " + trainerNumber + "?");
        return scr.nextLine();
    }

    public static String[][] assignPokemon(String[][] trainerAndPokemon) {
        for (int i = 0; i <= trainerAndPokemon.length -1; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
            trainerAndPokemon[i][1] = starterPokemons[randomNum];
        }
        return trainerAndPokemon;
    }

    public static void showAssignments(String[][] trainerAndPokemons) {
        System.out.println(Arrays.deepToString(trainerAndPokemons));
    }

}
