import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectation=new HashMap<>();

    public AffectationHashMap() {
    }

    public AffectationHashMap(Map<Employe, Departement> affectation) {
        this.affectation = affectation;
    }
    public Map<Employe, Departement> getAffectation() {
        return affectation;
    }
    public void setAffectation(Map<Employe, Departement> affectation) {
        this.affectation = affectation;
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        e.setNomDep(d.getNomDep());
       affectation.put(e, d);
    }
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe, Departement> entry : affectation.entrySet()){
            System.out.println(entry.getKey().getNom() + ", " + entry.getKey().getPrenom() + ": Department: " + entry.getValue().getNomDep());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectation.containsKey(e))
            affectation.remove(e);
        else
            System.out.println("l'employe n'existe pas.");
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if(affectation.containsKey(e) && affectation.containsValue(d))
            affectation.remove(e, d);
        else
            System.out.println("Employee or Departement n'existe pas.");
    }

    public void afficherEmployes(){
        Set<Employe> employees = affectation.keySet();
        Iterator<Employe> iterator = employees.iterator();
        System.out.println("Employees IDs:");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getId());
        }
    }

    public void afficherDepartments(){
        Collection<Departement> departments = affectation.values();
        System.out.println("Departments: ");
        for(Departement d : departments){
            System.out.println(d.getId() + ", " + d.getNomDep());
        }
    }

    public boolean rechercherEmploye(Employe e){
        return affectation.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }

    TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> Compartor = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeMap<Employe, Departement> newDetails = new TreeMap<>(Compartor);
        newDetails.putAll(affectation);
        return newDetails;
    }
}

