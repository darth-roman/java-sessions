package SysMed;

import java.util.Date;

public class DossierMalade{
	private int ID;
	private Patient patient;
	private Date date;
	private boolean isTreated;
	
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isTreated() {
		return isTreated;
	}
	public void setTreated(boolean isTreated) {
		this.isTreated = isTreated;
	}
}