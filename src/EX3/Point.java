package EX3;

public class Point implements Comparable<Point> {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    // Méthode pour calculer la distance à l'origine
    private double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Implémentation de compareTo pour comparer les distances à l'origine
    @Override
    public int compareTo(Point other) {
        return Double.compare(this.distanceToOrigin(), other.distanceToOrigin());
    }


}