import java.util.Date;
public class Cadre extends Empolye {
    private String Departement;
    public Cadre(String Matricule, String Nom, String Prenom, Date Date_N, String Departement) {
        super(Matricule, Nom, Prenom, Date_N);
        this.Departement = Departement;
    }
    public void afficher() {
        super.afficher();
        System.out.println("Departement : " + Departement);
    }

    @Override
    public void GetSalaire() {
        System.out.println("Salaire : 4000.0");
    }
}
