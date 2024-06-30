import java.util.Date;
public abstract class Empolye {
    private String Matricule;
    private String Nom;
    private String Prenom;
    private Date Date_N;
    public Empolye(String Matricule, String Nom, String Prenom, Date Date_N) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Date_N = Date_N;
    }

    public String getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public Date getDate_N() {
        return Date_N;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setDate_N(Date Date_N) {
        this.Date_N = Date_N;
    }

    public void afficher() {
        System.out.println("Matricule :" + Matricule);
        System.out.println("Nom :" + Nom);
        System.out.println("Prenom :" + Prenom);
        System.out.println("Date de naissance :" + Date_N);
    }

    public abstract void GetSalaire();
}
