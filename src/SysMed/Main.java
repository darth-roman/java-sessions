package SysMed;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercice 1
		Maladie m = new Maladie();
		Patient p = new Patient();
		
		m.setNom("Your Mom");
		
		p.setID(100);
		p.setNom("Chouchane Abderrahmane");
		p.setMaladie(m);
		System.out.println("The ID of p is "+p.getID()); // ??
	}

}
