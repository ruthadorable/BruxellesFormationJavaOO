package be.bxl.formation;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //region Exo 1) Génération d'une suite dans une tableau
        //  Réaliser un algorithme qui permet de créer un tableau de 10 entiers avec les valeurs suivantes :
        //  « 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 ». Ensuite afficher les valeurs avec une boucles.
        final int nbElement = 10;

        int[] tabSuite = new int[nbElement];

        // - Génération des valeurs
        tabSuite[0] = 2;
        for (int i = 1; i < tabSuite.length; i++) {
            tabSuite[i] = tabSuite[i - 1] * 2;
        }

        // - Création une valeur string avec toutes les valeurs
        StringBuilder sb  = new StringBuilder();
        for (int value : tabSuite) {
            sb.append(value).append(" > ");
        }
        String tabDisplay = sb.toString();

        // - Affichage du resultat
        System.out.println("Le tableau contient : " + tabDisplay + " \n");

        //endregion


        //region Exo 2) Déplacement du pion
        //  Réalisez un algorithme nous permettant de déplacer un pion dans un tableau de 10 éléments.
        //      Placer le poin dans la premiere case de tableau.
        //      L'utilisateur peut interagir avec le programme avec les commandes suivantes :
        //      - g -> Le poin se déplace de un vers la gauche
        //  - d -> Le poin se déplace de un vers la droite
        //  - q -> Arret du programme.
        //  Afficher le tableau avant chaque interaction.
        //  Tips : Le tableau peut contenir des valeurs de type String comme « _ » et « X »
        Scanner sc = new Scanner(System.in);

        final String PION = "X";
        final String CASE = "_";
        final int NB_CASE = 10;

        String[] zone = new String[NB_CASE];

        // - Génération du tableau
        for (int i = 0; i < zone.length; i++) {
            zone[i] = CASE;
        }

        // - Placement du pion aleatoirement
        Random rng = new Random();
        int position = rng.nextInt(NB_CASE);
        zone[position] = PION;

        String input;
        do {
            // - Affichage la zone
            for (String emplacement : zone) {
                System.out.print("|" + emplacement);
            }
            System.out.println("|");

            // - Saisie utilisateur
            System.out.print("Entrer une commande (g / d / q) : ");
            input = sc.nextLine().toLowerCase();

            // - Traitement
            zone[position] = CASE;
            if(input.equals("g") && position > 0) {
                position--;
            }
            else if (input.equals("d") && position < NB_CASE-1) {
                position++;
            }
            zone[position] = PION;


        } while(!input.equals("q"));

        System.out.println("Au revoir !");
        //endregion
    }
}
