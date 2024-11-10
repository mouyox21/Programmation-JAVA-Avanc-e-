package TP3_EX2;

public class Cercle extends Forme {
    private int rayon;
    private int x;
    private int y;

    public Cercle(int rayon, int x, int y) {
        this.rayon = rayon;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "cercle " + rayon + " " + x + " " + y;
    }
}
