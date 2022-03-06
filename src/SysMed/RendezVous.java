package SysMed;

public class RendezVous {
	private int ID;
	private Patient patient;
	private Doctor doctor;
	private boolean isDue;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public boolean isDue() {
		return isDue;
	}
	public void setDue(boolean isDue) {
		this.isDue = isDue;
	}
}
