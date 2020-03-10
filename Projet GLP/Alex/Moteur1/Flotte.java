package Moteur1;

public class Flotte {

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	
	public Flotte()
	{
		this.attaque=0;
		this.sante=0;
		this.capacit�=0;
		this.consommation=0;
	}
	
	public void AjouterNavireAttaque(){
		NavireAttaque navire=new NavireAttaque();
		attaque += navire.getAttaque();
		sante +=navire.getSante();
		capacit� += navire.getCapacit�();
		consommation += navire.getConsommation();
	}
	
	public void AjouterNavireTransport(){
		NavireTransport navire=new NavireTransport();
		attaque += navire.getAttaque();
		sante +=navire.getSante();
		capacit� += navire.getCapacit�();
		consommation += navire.getConsommation();
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
}
