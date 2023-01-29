package ht.bac3;

public class Etudiant {
 protected int matricule;
 protected String nom;
 private String promotion;
	private int age;
	private String EtatCivil;
 
 public Etudiant(int m,String n, String p, int a, String E) {
	 this.matricule = m;
	 this.nom = n;
	 this.promotion = p;
	 this.age = a;
	 this.EtatCivil = E;
 }
 public Etudiant() {
		
	}
	
	//METHODES GETTERS ET SETTERS PERMETTANT DE MODIFIER LES ELEMENTS 

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEtatCivil() {
		return EtatCivil;
	}

	public void setEtatCivil(String etatCivil) {
		EtatCivil = etatCivil;
	}
	// CREATTION DE LA METHODE PERMETTANT D'AFFICHER LES ELEMENTS SOUS FORME DE TEXTE 

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", promotion=" + promotion + ", age=" + age
				+ ", EtatCivil=" + EtatCivil + "]";
	}
	
	
	
	
	
	

}
 
 