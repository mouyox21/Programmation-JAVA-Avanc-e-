package TP2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class M_Annuaire implements Annuaire {
    private Map<Personne, ListeNumTel> annuaire = new HashMap<>();

    @Override
    public void afficher() {
        for (Map.Entry<Personne, ListeNumTel> entry : annuaire.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    @Override
    public boolean ajouterEntree(Personne p, ListeNumTel nums) {
        if (!annuaire.containsKey(p)) {
            annuaire.put(p, nums);
            return true;
        }
        return false;
    }

    @Override
    public boolean ajouterNumeroDebut(Personne p, NumTel num) {
        ListeNumTel liste = annuaire.get(p);
        if (liste != null) {
            return liste.ajouterDebut(num);
        }
        return false;
    }

    @Override
    public boolean ajouterNumeroFin(Personne p, NumTel num) {
        ListeNumTel liste = annuaire.get(p);
        if (liste != null) {
            return liste.ajouterFin(num);
        }
        return false;
    }

    @Override
    public ListeNumTel numeros(Personne p) {
        return annuaire.get(p);
    }

    @Override
    public Iterator<Personne> personnes() {
        return annuaire.keySet().iterator();
    }

    @Override
    public NumTel premierNumero(Personne p) {
        ListeNumTel liste = annuaire.get(p);
        return liste != null ? liste.premierNumero() : null;
    }

    @Override
    public boolean supprimer(Personne p) {
        return annuaire.remove(p) != null;
    }

    @Override
    public boolean supprimerNumero(Personne p, String num) {
        ListeNumTel liste = annuaire.get(p);
        if (liste != null) {
            return liste.retirer(num);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Personne, ListeNumTel> entry : annuaire.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }


    /**
     *  donne l'ensemble de toutes les personnes de l'annuaire dont le nom
     *  débute par une chaîne donnée.
     *  @param s1 la chaine pour la recherche
     *  @return l'ensemble des personnes de l'annuaire dont le nom débute
     *         par s1
     */

    @Override
    public Set<Personne> entreesPourChaine(String s1) {
        return annuaire.keySet().stream()
                .filter(p -> p.getNom().startsWith(s1))
                .collect(Collectors.toSet());
    }
}
