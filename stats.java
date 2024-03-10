package tp2s2;

import java.util.ArrayList;

public class stats {
    private ArrayList<etudiant> groupeEtudiants;

    public stats(ArrayList<etudiant> groupeEtudiants) {
        this.groupeEtudiants = groupeEtudiants;
    }

    public void afficherStatsEtudiants() {
        for (etudiant etudiant : groupeEtudiants) {
            System.out.println("Etudiant " + etudiant.getNom() +
                    " - Moyenne: " + etudiant.getValue() +
                    ", Meilleure note: " + etudiant.getMaxNote() +
                    ", Moins bonne note: " + etudiant.getMinNote());
        }
    }

    public void getMoyenneGroupe() {
        double sommeMoyennes = 0.0;
        for (etudiant etudiant : groupeEtudiants) {
            sommeMoyennes += etudiant.getValue();
        }
        double moyenneGroupe = sommeMoyennes / groupeEtudiants.size();
        System.out.println("Moyenne du groupe: " + moyenneGroupe);
    }

   public void getMaximumGroupe() {
	   etudiant meilleurEtudiant=groupeEtudiants.get(0);
	   for(etudiant etudiant  : groupeEtudiants ) {
		   if(etudiant.getValue()>meilleurEtudiant.getValue())
		   meilleurEtudiant=etudiant;
	   }
	   
	   System.out.println("Meilleur étudiant : " + meilleurEtudiant.getNom());

   }
   public void getMinimumGroupe() {
	    if (groupeEtudiants.isEmpty()) {
	        System.out.println("Aucun étudiant dans le groupe.");
	        return;
	    }

	    etudiant moinsBonEtudiant = groupeEtudiants.get(0);
	    
	    for (etudiant etudiant : groupeEtudiants) {
	        if (etudiant.getValue() < moinsBonEtudiant.getValue()) {
	            moinsBonEtudiant = etudiant;
	        }
	    }

	    System.out.println("Moins bon étudiant : " + moinsBonEtudiant.getNom());
	}


}
