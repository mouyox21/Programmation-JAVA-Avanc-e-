package EX2;

 public class Couple<T> {
    private T x, y; // les deux éléments du couple

    public Couple(T premier, T second) {
        x = premier;
        y = second;
    }

    public void affiche() {
        System.out.println("Premiere valeur : " + x + " - Deuxieme valeur : " + y);
    }
}
