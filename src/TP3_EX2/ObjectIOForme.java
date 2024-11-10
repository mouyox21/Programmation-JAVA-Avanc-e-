package TP3_EX2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ObjectIOForme implements IOForme {

    @Override
    public void sauver(Collection<Forme> formes, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(formes);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Forme> lire(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Collection<Forme>) ois.readObject();
        }
    }
}
