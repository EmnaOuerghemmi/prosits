public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe emp1 = new Employe(1, "Emna", "Ouerghemmi", "informatique", 3);
        Employe emp2 = new Employe(2, "Naima", "Elmi", "Éducatif", 2);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        System.out.println("Liste des employés :");
        societe.displayEmploye();
        String nomRecherche = "Nom1";
        boolean existeNom = societe.rechercherEmploye(nomRecherche);
        System.out.println("Employé avec le nom " + nomRecherche + " existe : " + existeNom);
        societe.supprimerEmploye(emp1);
        System.out.println("Liste des employés après suppression :");}}
       
