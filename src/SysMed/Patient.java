package SysMed;

public class Patient{
	private int ID;
	private String nom;
	private Maladie maladie;
	
	
	@Override
	public String toString() {
		return "Patient [getID()=" + getID() + ", getNom()=" + getNom() + ", getMaladie()=" + getMaladie().getNom() + "]";
	}
	
	
	
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
	public Maladie getMaladie() {
		return maladie;
	}
	public void setMaladie(Maladie maladie) {
		this.maladie = maladie;
	}
}