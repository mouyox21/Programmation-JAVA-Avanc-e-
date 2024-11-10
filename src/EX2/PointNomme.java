package EX2;

public class PointNomme extends Couple<Integer> {
    private String nom; // Nom du point

    public PointNomme(Integer x, Integer y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    @Override
    public void affiche() {
        System.out.println("Nom du point : " + nom);
        super.affiche();
    }
}
