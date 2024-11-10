package TP4_EX1;

import java.util.function.Predicate;

public class Affichage {
    // Méthode affichage_selectif qui affiche les éléments du tableau correspondant au prédicat
    public static void affichage_selectif(int[] tab, Predicate<Integer> condition) {
        for (int element : tab) {
            if (condition.test(element)) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
