package TP2;
import java.util.Date;
import java.util.Objects;

//public class Personne {
//    private String nom;
//    private String prenom;
//    private String civilite; // Exemples: "M.", "Mlle", "Mme"
//
//    public Personne(String nom, String prenom, String civilite) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.civilite = civilite;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public String getCivilite() {
//        return civilite;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Personne personne = (Personne) o;
//        return nom.equals(personne.nom) && prenom.equals(personne.prenom) && civilite.equals(personne.civilite);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nom, prenom, civilite);
//    }
//
//    @Override
//    public String toString() {
//        return civilite + " " + prenom + " " + nom;
//    }
//}



public class Personne implements Comparable<Personne> {
    private String nom;
    private String prenom;
    private String civilite;
    private Date date;



    public Personne(String nom, String prenom, String civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return nom.equals(personne.nom) && prenom.equals(personne.prenom) && civilite.equals(personne.civilite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, civilite);
    }

    @Override
    public int compareTo(Personne autre) {
        int nomCompare = this.nom.compareTo(autre.nom);
        return (nomCompare != 0) ? nomCompare : this.prenom.compareTo(autre.prenom);
    }

    @Override
    public String toString() {
        return civilite + " " + prenom + " " + nom;
    }
}
