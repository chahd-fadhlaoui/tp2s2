package tp2s2;

public class note {
private String NomCours;
private double note;
public note(String nomCours, double note) {
	NomCours = nomCours;
	this.note = note;
}
public String getNomCours() {
	return NomCours;
}
public void setNomCours(String nomCours) {
	NomCours = nomCours;
}
public double getNote() {
	return note;
}
public void setNote(double note) {
	this.note = note;
}
@Override
public String toString() {
	return "note [NomCours=" + NomCours + ", note=" + note + "]";
}

void addnote(double note) {
	
}

}
