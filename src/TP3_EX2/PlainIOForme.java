package TP3_EX2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class PlainIOForme implements IOForme {

    @Override
    public void sauver(Collection<Forme> formes, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Forme forme : formes) {
                writer.write(forme.toString());
                writer.newLine();
            }
        }
    }

    @Override
    public Collection<Forme> lire(String fileName) throws IOException {
        Collection<Forme> formes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts[0].equals("rectangle")) {
                    int longueur = Integer.parseInt(parts[1]);
                    int largeur = Integer.parseInt(parts[2]);
                    int x = Integer.parseInt(parts[3]);
                    int y = Integer.parseInt(parts[4]);
                    formes.add(new Rectangle(longueur, largeur, x, y));
                } else if (parts[0].equals("cercle")) {
                    int rayon = Integer.parseInt(parts[1]);
                    int x = Integer.parseInt(parts[2]);
                    int y = Integer.parseInt(parts[3]);
                    formes.add(new Cercle(rayon, x, y));
                }
            }
        }
        return formes;
    }
}
