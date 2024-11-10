package TP4_EX2;

import java.util.function.Predicate;

public class Affichageupdated {
    public static void affichage_selectif(int[] tab, Predicate<Integer> condition) {
        for (int element : tab) {
            if (condition.test(element)) {
                System.out.print(element + " * ");
            }
        }
        System.out.println();
    }
}
