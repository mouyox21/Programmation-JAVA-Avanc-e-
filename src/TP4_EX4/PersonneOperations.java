package TP4_EX4;

import java.util.*;
import java.util.stream.*;

public class PersonneOperations {

    // Afficher le nom des personnes nées après 1985
    public static void afficherNomsApres1985(List<Personnes> personnes) {
        personnes.stream()
                .filter(p -> p.getAnnee() > 1985)
                .map(Personnes::getNom)
                .forEach(System.out::println);
    }

    // Afficher le nom des personnes nées avant 2000, triées par ordre alphabétique sur leur nom et afficher leur nombre
    public static void afficherNomsAvant2000EtCompter(List<Personnes> personnes) {
        List<String> nomsAvant2000 = personnes.stream()
                .filter(p -> p.getAnnee() < 2000)
                .sorted(Comparator.comparing(Personnes::getNom))
                .map(Personnes::getNom)
                .toList();

        nomsAvant2000.forEach(System.out::println);
        System.out.println("Nombre de personnes nées avant 2000 : " + nomsAvant2000.size());
    }

    // Afficher tous les noms et prénoms, triés par ordre alphabétique sur le nom et le prénom
    public static void afficherNomsEtPrenomsTries(List<Personnes> personnes) {
        personnes.stream()
                .sorted(Comparator.comparing(Personnes::getNom)
                        .thenComparing(Personnes::getPrenom))
                .forEach(p -> System.out.println(p.getNom() + " " + p.getPrenom()));
    }

    // Trouver et afficher l'année de naissance de la plus jeune personne sans comparateur
    public static void afficherAnneePlusJeune(List<Personnes> personnes) {
        int anneePlusJeune = personnes.stream()
                .mapToInt(Personnes::getAnnee)
                .max()
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Année de naissance de la plus jeune personne : " + anneePlusJeune);
    }

    // Trouver et afficher le nom, prénom et année de naissance de la plus jeune personne avec un comparateur
    public static void afficherPlusJeunePersonnes(List<Personnes> personnes) {
        Personnes plusJeunePersonnes = personnes.stream()
                .max(Comparator.comparingInt(Personnes::getAnnee))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("La plus jeune personne : " + plusJeunePersonnes);
    }
}
