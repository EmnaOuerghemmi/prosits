import java.util.Objects;

public class Employe {
    int id;
    String nom;
    String prenom;
    String nomDep;
    int grade;

    public Employe() {
    }
    public Employe(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employés)) return false;
        return id == employés.id && Objects.equals(nom, employés.nom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Employés{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }
}
