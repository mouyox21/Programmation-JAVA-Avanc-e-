package TP2;

import java.util.Iterator;


public interface ListeNumTel {
    boolean ajouter(int index, NumTel num);
    boolean ajouterDebut(NumTel num);
    boolean ajouterFin(NumTel num);
    boolean contientNumero(String num);
    Iterator<NumTel> iterator();
    int nbNumeros();
    NumTel numero(int index);
    NumTel premierNumero();
    boolean retirer(String num);
    String toString();
}
