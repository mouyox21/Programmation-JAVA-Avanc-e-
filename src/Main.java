import EX1.Triplet;
import EX1.TripletH;
import EX2.CoupleNomme;
import EX2.PointNomme;
import EX3.Point;
import EX3.Utils;
import TP2.*;
import TP3_EX1.FileInfo;
import TP3_EX2.*;
import TP3_EX3.IntegerExtractor;
import TP4_EX1.Affichage;
import TP4_EX2.Affichageupdated;
import TP4_EX3.Points;
import TP4_EX3.Utilitaire;
import TP4_EX4.PersonneOperations;
import TP4_EX4.Personnes;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select which TP you want to launch:");
        System.out.println("1 - TP1: La programmation générique");
        System.out.println("2 - TP2: JAVA Collections - Annuaire");
        System.out.println("3 - TP3: Les flux et fichiers");
        System.out.println("4 - TP4: Les expressions lambda et streams");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                launchTP1();
                break;
            case 2:
                launchTP2();
                break;
            case 3:
                launchTP3();
                break;
            case 4:
                launchTP4();
                break; // Add this case
            default:
                System.out.println("Invalid choice. Exiting program.");
                break;
        }

        scanner.close();
    }

    private static void launchTP1() {
        System.out.println("TP1 - La programmation générique");
        System.out.println("EX1 - Triplet");
        System.out.println("////////////////////////////////////////////////////////////");

        Triplet<Integer> tripletInt = new Triplet<>(1, 2, 3);
        tripletInt.affiche();

        Triplet<String> tripletStr = new Triplet<>("A", "B", "C");
        tripletStr.affiche();

        System.out.println("Premier élément de tripletStr: " + tripletStr.getPremier());
        System.out.println("Second élément de tripletInt: " + tripletInt.getSecond());

        TripletH<Integer, String, Double> tripletMixte = new TripletH<>(1, "Hello", 3.14);
        tripletMixte.affiche();

        TripletH<String, String, Integer> tripletInfo = new TripletH<>("Nom", "Prénom", 30);
        tripletInfo.affiche();

        System.out.println("Premier élément de tripletMixte: " + tripletMixte.getPremier());
        System.out.println("Troisième élément de tripletInfo: " + tripletInfo.getTroisieme());

        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("Exercice 2 : Couple");

        CoupleNomme<String> coupleNomme = new CoupleNomme<>("Hello", "World", "Greeting");
        coupleNomme.affiche();

        PointNomme pointNomme = new PointNomme(5, 10, "PointA");
        pointNomme.affiche();

        System.out.println("//////////////////////////////////////////");
        System.out.println("EX3 : Point");

        Point[] points = {
                new Point(1, 2),
                new Point(3, 4),
                new Point(0, 5)
        };

        Point maxPoint = Utils.max(points);
        System.out.print("Point le plus éloigné de l'origine : ");
        maxPoint.affiche();
    }

    private static void launchTP2() {
        System.out.println("TP2 - JAVA Collections - Annuaire");

        M_Annuaire annuaire = new M_Annuaire();

        Personne sophie = new Personne("DURAND", "Sophie", "Mlle");
        Personne jean = new Personne("DUPONT", "Jean", "M.");
        Personne louis = new Personne("DUSCHMOL", "Louis", "M.");
        Personne robert = new Personne("AARGH", "Robert", "M.");


        NumTel num1 = new NumTel("151171", "portable");
        NumTel num2 = new NumTel("151171", "fixe domicile");
        NumTel num3 = new NumTel("146761", "fax");
        NumTel num4 = new NumTel("140361", "fixe professionnel");

        ListeNumTel listeSophie = new ListeNumTelImpl();
        listeSophie.ajouterFin(num1);

        ListeNumTel listeJean = new ListeNumTelImpl();
        listeJean.ajouterFin(num2);

        ListeNumTel listeLouis = new ListeNumTelImpl();
        listeLouis.ajouterFin(num3);

        ListeNumTel listeRobert = new ListeNumTelImpl();
        listeRobert.ajouterFin(num4);

        annuaire.ajouterEntree(sophie, listeSophie);
        annuaire.ajouterEntree(jean, listeJean);
        annuaire.ajouterEntree(louis, listeLouis);
        annuaire.ajouterEntree(robert, listeRobert);

        annuaire.afficher();

        System.out.println("Numéros de Sophie DURAND: " + annuaire.numeros(sophie));
        System.out.println("Numéros de Jean DUPONT: " + annuaire.numeros(jean));

        System.out.println("\nPersonnes dont le nom commence par 'DU':");
        Set<Personne> resultat = annuaire.entreesPourChaine("DU");
        resultat.forEach(System.out::println);
    }

    private static void launchTP3() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TP3 - JAVA Collections - Listes");


        System.out.println("Select which Exercice you want to launch:");
        System.out.println("1 - EX1");
        System.out.println("2 - EX2");
        System.out.println("3 - EX3");
        System.out.print("Enter  your choice: ");
        int ex = scanner.nextInt();

        switch (ex) {
            case 1:
                launchTP3EX1();
                break;
            case 2:
                launchTP3EX2();
                break;
            case 3:
                launchTP3EX3();
                break; // Add this case
            default:
                System.out.println("Invalid choice. Exiting program.");
                break;
        }

    }
        private static void launchTP3EX1() {
            String FilePath ="C:\\Users\\Mouad Project\\Desktop";
            FileInfo fileInfo = new FileInfo();
            fileInfo.afficherInfosFichier(FilePath);
        }

        private static void launchTP3EX2() throws IOException, ClassNotFoundException {
            String fileNameText = "formes.txt";
            String fileNameBinary = "formes.bin";

            // Créer une collection de formes
            Collection<Forme> formes1 = new ArrayList<>();
            formes1.add(new Rectangle(8, 2, 5, 6));
            formes1.add(new Cercle(3, 0, 5));

            // Tester avec le stockage texte
            IOForme ioText = new PlainIOForme();
            ioText.sauver(formes1, fileNameText);
            Collection<Forme> formes2 = ioText.lire(fileNameText);
            System.out.println("Contenu du fichier texte:");
            for (Forme f : formes2) {
                System.out.println(f);
            }

            // Tester avec le stockage binaire
            IOForme ioBinary = new ObjectIOForme();
            ioBinary.sauver(formes1, fileNameBinary);
            Collection<Forme> formes3 = ioBinary.lire(fileNameBinary);
            System.out.println("\nContenu du fichier binaire:");
            for (Forme f : formes3) {
                System.out.println(f);
            }
        }

        private static void launchTP3EX3() {
            Scanner scanner = new Scanner(System.in);
            IntegerExtractor extractor = new IntegerExtractor();

            System.out.println("Choisissez une option:");
            System.out.println("1 - Entrer un texte directement");
            System.out.println("2 - Fournir le chemin d'un fichier texte");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();  // Consomme la nouvelle ligne

            try {
                int result = 0;

                if (choix == 1) {
                    // Demande un texte à l'utilisateur
                    System.out.println("Entrez votre texte : ");
                    String text = scanner.nextLine();

                    // Utilise StringReader pour lire le texte
                    result = extractor.sumOfIntegers(new StringReader(text));

                } else if (choix == 2) {
                    // Demande le chemin du fichier à l'utilisateur
                    System.out.print("Entrez le chemin du fichier : ");
                    String filePath = scanner.nextLine();

                    // Utilise FileReader pour lire le fichier
                    result = extractor.sumOfIntegers(new FileReader(filePath));

                } else {
                    System.out.println("Choix non valide !");
                    return;
                }

                System.out.println("La somme des entiers est : " + result);

            } catch (IOException e) {
                System.err.println("Erreur lors de la lecture : " + e.getMessage());
            }
        }
        
    private static void launchTP4 () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("TP4 - Les expressions lambda et streams ");


        System.out.println("Select which Exercice you want to launch:");
        System.out.println("1 - EX1");
        System.out.println("2 - EX2");
        System.out.println("3 - EX3");
        System.out.println("4 - EX4");
        System.out.print("Enter  your choice: ");
        int ex = scanner.nextInt();

        switch (ex) {
            case 1:
                launchTP4EX1();
                break;
            case 2:
                launchTP4EX2();
                break;
            case 3:
                launchTP4EX3();
                break;
            case 4:
                launchTP4EX4();
                break; // Add this case
            default:
                System.out.println("Invalid choice. Exiting program.");
                break;
        }
        
    }




    private static void launchTP4EX1() {
        int[] tab = {1, 4, -2, 9, -3, 5, -3};
        System.out.print("-- Les positifs de tab : ");
        Affichage.affichage_selectif(tab, ee -> ee > 0);
    }

    private static void launchTP4EX2() {
        int[] tab = {1, 4, -2, 9, -3, 5, -3, 12, -11, 7, 6, 0};

        System.out.print("-- Les positifs : ");
        Affichageupdated.affichage_selectif(tab, ee -> ee > 0); // Condition pour les nombres positifs

        System.out.print("-- Les negatifs : ");
        Affichageupdated.affichage_selectif(tab, ee -> ee < 0); // Condition pour les nombres négatifs

        System.out.print("-- Les pairs : ");
        Affichageupdated.affichage_selectif(tab, ee -> ee % 2 == 0); // Condition pour les nombres pairs

        System.out.print("-- Les impairs : ");
        Affichageupdated.affichage_selectif(tab, ee -> ee % 2 != 0); // Condition pour les nombres impairs
    }

    private static void launchTP4EX3() {

        List<Points> liste = new ArrayList<>();
        liste.add(new Points(2, 5));
        liste.add(new Points(-3, 4));
        liste.add(new Points(6, -3));
        liste.add(new Points(2, 3));

        // Cas 1 : Sélection des points d'abscisse positive, triés par leurs abscisses, affichés avec la méthode `affiche`
        System.out.print("-- Points d'abscisse positive triés par x : ");
        Utilitaire.traiteListe(
                liste,
                point -> point.getX() > 0, // Sélection : abscisse positive
                Comparator.comparingInt(Points::getX), // Tri : par valeur de x
                Points::affiche // Affichage : méthode affiche() de Point
        );

        // Cas 2 : Sélection de tous les éléments, triés par la somme des coordonnées, affichés dans un format personnalisé
        System.out.print("-- Points triés par somme des coordonnées : ");
        Utilitaire.traiteListe(
                liste,
                point -> true, // Sélection : tous les éléments
                Comparator.comparingInt(point -> point.getX() + point.getY()), // Tri : par somme des coordonnées
                point -> System.out.print("(abs = " + point.getX() + ", ord = " + point.getY() + ") ") // Affichage personnalisé
        );


    }

    private static void launchTP4EX4() {
        List<Personnes> personnes = Arrays.asList(
                new Personnes("Alice", "Dupont", 1987),
                new Personnes("Bob", "Martin", 1992),
                new Personnes("Charlie", "Durand", 1980),
                new Personnes("David", "Arnaud", 2001),
                new Personnes("Eve", "Blanc", 1995)
        );

        System.out.println("Personnes nées après 1985 :");
        PersonneOperations.afficherNomsApres1985(personnes);

        System.out.println("\nPersonnes nées avant 2000 (triées par nom) :");
        PersonneOperations.afficherNomsAvant2000EtCompter(personnes);

        System.out.println("\nTous les noms et prénoms (triés par nom et prénom) :");
        PersonneOperations.afficherNomsEtPrenomsTries(personnes);

        PersonneOperations.afficherAnneePlusJeune(personnes);

        PersonneOperations.afficherPlusJeunePersonnes(personnes);
    }

}
