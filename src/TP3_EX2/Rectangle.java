package TP3_EX2;

public class Rectangle extends Forme {
    private int longueur;
    private int largeur;
    private int x;
    private int y;

    public Rectangle(int longueur, int largeur, int x, int y) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "rectangle " + longueur + " " + largeur + " " + x + " " + y;
    }
}

