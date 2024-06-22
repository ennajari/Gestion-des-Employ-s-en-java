import java.util.Date;

public class Patron extends Empolye {
    private String entreprise;

    public Patron(String Matricule, String Nom, String Prenom, Date Date_N, String entreprise) {
        super(Matricule, Nom, Prenom, Date_N);
        this.entreprise = entreprise;
    }
    public void afficher() {
        super.afficher();
        System.out.println("Entreprise :" + entreprise);
    }
    @Override
    public void GetSalaire() {
        System.out.println("Salaire : 10000.0");
    }
}
