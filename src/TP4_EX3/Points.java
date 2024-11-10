package TP4_EX3;

public class Points {
    private int x, y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void affiche() {
        System.out.print(" [ " + x + ", " + y + "] ");
    }
}

