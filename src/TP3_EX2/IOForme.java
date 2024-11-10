package TP3_EX2;

import java.io.IOException;
import java.util.Collection;

public interface IOForme {
    Collection<Forme> lire(String fileName) throws IOException, ClassNotFoundException;
    void sauver(Collection<Forme> formes, String fileName) throws IOException;
}
