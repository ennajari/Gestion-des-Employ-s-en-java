import java.util.Date;
public class Ouvrier extends Empolye {
    private Date Date_Entree;
    public Ouvrier(String Matricule, String Nom, String Prenom, Date Date_N, Date Date_Entree) {
        super(Matricule, Nom, Prenom, Date_N);
        this.Date_Entree = Date_Entree;
    }
    public Date getDate_Entree() {
        return Date_Entree;
    }
    @Override
    public void GetSalaire() {
        System.out.println("Salaire de l'ouvrier : 2000.0");
    }
}
