package EX1;

public class Triplet<T> {
    private T premier;
    private T second;
    private T troisieme;

    // Constructeur avec trois arguments
    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Méthodes d'accès
    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Premier: " + premier + ", Second: " + second + ", Troisième: " + troisieme);
    }
}
