package EX1;

public class TripletH<T1, T2, T3> {
    private T1 premier;
    private T2 second;
    private T3 troisieme;

    // Constructeur avec trois arguments de types différents
    public TripletH(T1 premier, T2 second, T3 troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Méthodes d'accès
    public T1 getPremier() {
        return premier;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getTroisieme() {
        return troisieme;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Premier: " + premier + ", Second: " + second + ", Troisième: " + troisieme);
    }
}
