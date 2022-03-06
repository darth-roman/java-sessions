package SysMed;

public class Maladie{
	private int ID;
	
	@Override
	public String toString() {
		return "Maladie [getID()=" + getID() + ", getNom()=" + getNom() + ", getMedicament()=" + getMedicament() + "]";
	}
	private String nom;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	private Medicament medicament;
}