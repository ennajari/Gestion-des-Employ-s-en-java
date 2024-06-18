import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

     // Saisie des données pour un ouvrier
        System.out.println("Saisie des données pour un ouvrier:");
        System.out.print("Matricule: ");
        String matriculeOuvrier = scanner.nextLine();
        System.out.print("Nom: ");
        String nomOuvrier = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenomOuvrier = scanner.nextLine();
        System.out.print("Date de naissance (yyyy-MM-dd): ");
        Date dateNaissanceOuvrier = readDate(scanner);
        System.out.print("Date d'entrée à la société (yyyy-MM-dd): ");
        Date dateEntreeOuvrier = readDate(scanner);

        Ouvrier ouvrier = new Ouvrier(matriculeOuvrier, nomOuvrier, prenomOuvrier, dateNaissanceOuvrier, dateEntreeOuvrier);

        // Saisie des données pour un cadre
        System.out.println("\nSaisie des données pour un cadre:");
        System.out.print("Matricule: ");
        String matriculeCadre = scanner.nextLine();
        System.out.print("Nom: ");
        String nomCadre = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenomCadre = scanner.nextLine();
        System.out.print("Date de naissance (yyyy-MM-dd): ");
        Date dateNaissanceCadre = readDate(scanner);
        System.out.print("Département: ");
        String departementCadre = scanner.nextLine();

        Cadre cadre = new Cadre(matriculeCadre, nomCadre, prenomCadre, dateNaissanceCadre, departementCadre);

        // Saisie des données pour un patron
        System.out.println("\nSaisie des données pour un patron:");
        System.out.print("Matricule: ");
        String matriculePatron = scanner.nextLine();
        System.out.print("Nom: ");
        String nomPatron = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenomPatron = scanner.nextLine();
        System.out.print("Date de naissance (yyyy-MM-dd): ");
        Date dateNaissancePatron = readDate(scanner);
        System.out.print("Nom de l'entreprise: ");
        String entreprisePatron = scanner.nextLine();

        Patron patron = new Patron(matriculePatron, nomPatron, prenomPatron, dateNaissancePatron, entreprisePatron);

        // Affichage des informations et salaires
        System.out.println("\nInformations et salaires :");
        System.out.println("Ouvrier :");
        ouvrier.afficher();
        ouvrier.GetSalaire();

        System.out.println("\nCadre :");
        cadre.afficher();
        cadre.GetSalaire();

        System.out.println("\nPatron :");
        patron.afficher();
        patron.GetSalaire();

        // Fermeture du scanner
        scanner.close();
    }

    private static Date readDate(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
