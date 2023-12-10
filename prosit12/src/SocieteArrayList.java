import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employes) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe emp : employes) {
            System.out.println(emp.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes,Comparator.comparing(Employe::getId));
    }


    /*public void trierEmployeParId() {
        Collections.sort(employes); // Utilise la méthode compareTo de l'interface Comparable définie dans Employe
    }*/

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomDep)
                .thenComparingInt(Employe::getGrade));
    }
}

