package tp2s2;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        etudiant etudiant1 = new etudiant("123", "ahmed");
        etudiant1.addNote("Math", 15.0);
        etudiant1.addNote("Physics", 18.5);

        etudiant etudiant2 = new etudiant("456", "tuka");
        etudiant2.addNote("Math", 16.5);
        etudiant2.addNote("Physics", 13.0);

        ArrayList<etudiant> groupeEtudiants = new ArrayList<>();
        groupeEtudiants.add(etudiant1);
        groupeEtudiants.add(etudiant2);

        stats stats = new stats(groupeEtudiants);

        stats.afficherStatsEtudiants();

        stats.getMoyenneGroupe();

        stats.getMaximumGroupe();

        stats.getMinimumGroupe();

        Collections.sort(groupeEtudiants);
        System.out.println("\nStudents sorted by average:");
        for (etudiant etudiant : groupeEtudiants) {
            System.out.println(etudiant);
        }
    }
}
