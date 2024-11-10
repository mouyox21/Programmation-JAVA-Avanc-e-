package EX2;

public class CoupleNomme<T> extends Couple<T> {
    private String nom; // Nom du couple

    public CoupleNomme(T premier, T second, String nom) {
        super(premier, second);
        this.nom = nom;
    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + nom);
        super.affiche();
    }
}
