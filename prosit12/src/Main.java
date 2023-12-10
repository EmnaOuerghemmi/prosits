import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //prosit9
        SocieteArrayList societe = new SocieteArrayList();
        Employe emp1 = new Employe(1, "Ouerghemmi", "Emna", "Informatique", 3);
        Employe emp2 = new Employe(2, "Elmi", "Naima", "Education", 2);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        System.out.println("Liste des employés :");
        societe.displayEmploye();
        String nomRecherche = "Nom1";
        boolean existeNom = societe.rechercherEmploye(nomRecherche);
        System.out.println("Employé avec le nom " + nomRecherche + " existe : " + existeNom);
        societe.supprimerEmploye(emp1);
        System.out.println("Liste des employés après suppression :");
        //prosit 10
        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Educatif", 30);
        Departement dep3 = new Departement(3, "Vente en ligne", 40);

        DepartementHashSet dep = new DepartementHashSet();
        dep.ajouterDepartement(dep1);
        dep.ajouterDepartement(dep2);
        dep.ajouterDepartement(dep3);

        // Affichage des départements
        System.out.println("Liste des départements :");
        dep.displayDepartement();

        // Recherche d'un département par nom
        String recherche = "Informatique";
        if (dep.rechercherDepartement(recherche)) {
            System.out.println("Le département '" + recherche + "' a été trouvé.");
        } else {
            System.out.println("Le département '" + recherche + "' n'a pas été trouvé.");
        }

        // Suppression d'un département
        dep.supprimerDepartement(dep2);

        // Affichage des départements après suppression
        System.out.println("Liste des départements après suppression :");
        dep.displayDepartement();
        // Tri des départements par ID et affichage
        System.out.println("Liste des départements triés par ID :");
        System.out.println(dep.trierDepartementById());
        //prosit 11
        AffectationHashMap AHM = new AffectationHashMap();
       /* Employe e1 = new Employe(1, "Ouerghemmi", "Ouer", "Informatique", 3);
        Employe e2 = new Employe(2, "Elmi", "naima", "Education", 2);
        Employe e3 = new Employe(3, "Ayari", "wiem", "Informatique", 2);
        Departement d1 = new Departement(1, "J24", 10);
        Departement d2 = new Departement(2, "J25", 10);  */

        AHM.ajouterEmployeDepartement(emp1, dep1);
        AHM.ajouterEmployeDepartement(emp2, dep2);
        AHM.ajouterEmployeDepartement(emp1, dep2);
        AHM.afficherEmployesEtDepartements();
        AHM.supprimerEmploye(emp2);
        AHM.afficherEmployes();
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(emp2));
        System.out.println(AHM.rechercherDepartement(dep1));
        System.out.println(AHM.trierMap());
        AHM.supprimerEmployeEtDepartement(emp1, dep2);
        AHM.afficherEmployesEtDepartements();
        //prosit 12
        List<Etudiant> etudiants = new ArrayList<>();
        StudentManagement students = new StudentManagement();
        Etudiant e1 = new Etudiant(1, "Emna", 22);
        Etudiant e2 = new Etudiant(2, "wiem", 21);
        Consumer<Etudiant> con = etudiant -> System.out.println(etudiant.toString());
        Predicate<Etudiant> pre = etudiant -> etudiant.getNom().startsWith("E"); //Checks etudiants that starts with letter "H"
        Function<Etudiant, String> fun = Etudiant::getNom;
        Supplier<Etudiant> sup = Etudiant::new;
        Comparator<Etudiant> comp = Comparator.comparingInt(Etudiant::getId);
          students.addEtudiant(etudiants, e2);
                  students.addEtudiant(etudiants, e1);

                  students.displayStudents(etudiants, con);
                  students.displayStudentsByFilter(etudiants, pre, con);
                  System.out.println(students.returnStudentsNames(etudiants, fun));
                  Etudiant e = students.createStudent(sup);
                  System.out.println(e);
                  etudiants = students.sortStudentsById(etudiants, comp);
                  System.out.println(etudiants);
        Stream<Etudiant> etudiantStream = students.convertToStream(etudiants);
        etudiantStream.forEach(System.out::println);
        System.out.println("PROJET TERMINE");
    }}