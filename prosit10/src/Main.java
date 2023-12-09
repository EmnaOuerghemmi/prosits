public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe emp1 = new Employe(1, "Nom1", "Prenom1", "Departement1", 3);
        Employe emp2 = new Employe(2, "Nom2", "Prenom2", "Departement2", 2);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);

        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche d'un employé par nom
        String nomRecherche = "Nom1";
        boolean existeNom = societe.rechercherEmploye(nomRecherche);
        System.out.println("Employé avec le nom " + nomRecherche + " existe : " + existeNom);

        // Suppression d'un employé
        societe.supprimerEmploye(emp1);

        // Affichage mis à jour des employés
        System.out.println("Liste des employés après suppression :");}}
       
