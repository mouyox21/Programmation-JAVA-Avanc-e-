package TP3_EX3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

// Classe IntegerExtractor pour extraire et additionner les entiers d'un flux
public class IntegerExtractor {

    // Méthode qui extrait les entiers d'un flux de texte et calcule leur somme
    public int sumOfIntegers(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        int sum = 0;

        while ((line = bufferedReader.readLine()) != null) {
            // Utilisation d'une expression régulière pour extraire les entiers de chaque ligne
            String[] numbers = line.split("\\D+");  // Split par tout caractère non numérique
            for (String number : numbers) {
                if (!number.isEmpty()) {  // Ignorer les éléments vides
                    sum += Integer.parseInt(number);
                }
            }
        }
        return sum;
    }
}
