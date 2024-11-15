package TP2;

import java.util.Iterator;
import java.util.Set;

public interface Annuaire {
    void afficher();                                               // Affiche l'annuaire complet
    boolean ajouterEntree(Personne p, ListeNumTel nums);           // Ajoute une entrée avec une personne et ses numéros
    boolean ajouterNumeroDebut(Personne p, NumTel num);            // Ajoute un numéro au début de la liste d'une personne
    boolean ajouterNumeroFin(Personne p, NumTel num);              // Ajoute un numéro à la fin de la liste d'une personne
    ListeNumTel numeros(Personne p);                               // Renvoie la liste des numéros d'une personne
    Iterator<Personne> personnes();                                // Renvoie un itérateur sur toutes les personnes
    NumTel premierNumero(Personne p);                              // Renvoie le premier numéro d'une personne
    boolean supprimer(Personne p);                                 // Supprime une personne de l'annuaire
    boolean supprimerNumero(Personne p, String num);               // Supprime un numéro de la liste d'une personne
    String toString();                                             // Retourne une représentation complète de l'annuaire

    Set<Personne> entreesPourChaine(String s1);
}
