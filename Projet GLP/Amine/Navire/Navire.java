package Navire;

public class Navire {

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	private int niveau;
	
	public Navire()
	{
		this.attaque=0;
		this.sante=0;
		this.capacit�=0;
		this.consommation=0;
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacit�+"\n"+consommation;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public void setCapacit�(int capacit�) {
		this.capacit� = capacit�;
	}

	public int getConsommation() {
		return consommation;
	}

	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	
}
