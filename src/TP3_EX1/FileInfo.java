package TP3_EX1;

import java.io.File;

public class FileInfo {
    // Méthode qui prend un chemin d'accès et affiche les informations du fichier ou répertoire
    public void afficherInfosFichier(String chemin) {
        File file = new File(chemin);

        // Vérifie si le fichier ou répertoire existe
        if (!file.exists()) {
            System.out.println("Le fichier ou répertoire spécifié n'existe pas.");
        } else if (file.isDirectory()) {
            // Si c'est un répertoire, affiche la liste des fichiers
            System.out.println("Contenu du répertoire :");
            String[] files = file.list();
            if (files != null) {
                for (String f : files) {
                    System.out.println(f);
                }
            } else {
                System.out.println("Impossible de lister les fichiers.");
            }
        } else {
            // Si c'est un fichier, affiche sa taille et son chemin absolu
            System.out.println("Chemin absolu : " + file.getAbsolutePath());
            System.out.println("Taille du fichier : " + file.length() + " octets");
        }
    }
}
