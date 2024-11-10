package TP4_EX4;

public class Personnes {
    private String nom, prenom;
    private int annee_naissance;

    public Personnes(String prenom, String nom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee_naissance = annee;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAnnee() { return annee_naissance; }

    @Override
    public String toString() {
        return prenom + " " + nom + " (" + annee_naissance + ")";
    }
}