package TP4_EX3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Utilitaire {

    // Méthode statique traiteListe avec les opérations de sélection, tri et affichage
    public static void traiteListe(List<Points> liste, Predicate<Points> selection, Comparator<Points> tri, Consumer<Points> affichage) {
        // Liste pour stocker les éléments sélectionnés
        List<Points> selectionnes = new ArrayList<>();

        // Sélection des éléments
        for (Points point : liste) {
            if (selection.test(point)) {
                selectionnes.add(point);
            }
        }

        // Tri des éléments sélectionnés
        Collections.sort(selectionnes, tri);

        // Affichage des éléments triés
        for (Points point : selectionnes) {
            affichage.accept(point);
        }
        System.out.println();
    }
}