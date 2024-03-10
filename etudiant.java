package tp2s2;

import java.util.ArrayList;

public class etudiant implements IStatisticable , Comparable<etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<note> listeNotes;

    public etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
    }

    public String getMatricule() {
        return matricule;
    }
     
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<note> getListeNotes() {
        return listeNotes;
    }

    

    @Override
    public String toString() {
        return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", listeNotes=" + listeNotes + "]";
    }
    public void addNote(String nomCours, double note) {
        note nouvelleNote = new note(nomCours, note);
        listeNotes.add(nouvelleNote);
    }
   

	@Override
	public double getValue() {
		if(listeNotes.isEmpty()) {
			return 0;
		}
		double somme=0;
		for(note note : listeNotes) {
			somme+=note.getNote();
		}
		return (somme/listeNotes.size());
		
	}
	public note getMinNote() {
		note maxNote=listeNotes.get(0);
		for(note currentnote : listeNotes) {
			if(currentnote.getNote()>maxNote.getNote()) {
				maxNote=currentnote;
			}
		}
		return maxNote;
	}
	 public note getMaxNote() {	       
	        note minNote = listeNotes.get(0);
	        for (note currentNote : listeNotes) {
	            if (currentNote.getNote() < minNote.getNote()) {
	                minNote = currentNote;
	            }
	        }
	        return minNote;
	    }


	@Override
	public int compareTo(etudiant e) {
		if(e.getValue()>this.getValue()) {
			 return 1;
		 }
		 else if (e.getValue()<this.getValue()) {
			 return -1;
		 }
		 else
			 return 0;
	}
		
}
