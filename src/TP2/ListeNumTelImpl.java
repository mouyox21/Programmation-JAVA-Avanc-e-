package TP2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListeNumTelImpl implements ListeNumTel {
    private List<NumTel> numeros = new ArrayList<>();

    @Override
    public boolean ajouter(int index, NumTel num) {
        if (contientNumero(num.getNumero())) return false;
        numeros.add(index, num);
        return true;
    }

    @Override
    public boolean ajouterDebut(NumTel num) {
        return ajouter(0, num);
    }

    @Override
    public boolean ajouterFin(NumTel num) {
        if (contientNumero(num.getNumero())) return false;
        numeros.add(num);
        return true;
    }

    @Override
    public boolean contientNumero(String num) {
        return numeros.stream().anyMatch(n -> n.getNumero().equals(num));
    }

    @Override
    public Iterator<NumTel> iterator() {
        return numeros.iterator();
    }

    @Override
    public int nbNumeros() {
        return numeros.size();
    }

    @Override
    public NumTel numero(int index) {
        return (index >= 0 && index < numeros.size()) ? numeros.get(index) : null;
    }

    @Override
    public NumTel premierNumero() {
        return numeros.isEmpty() ? null : numeros.get(0);
    }

    @Override
    public boolean retirer(String num) {
        return numeros.removeIf(n -> n.getNumero().equals(num));
    }

    @Override
    public String toString() {
        return numeros.toString();
    }
}
