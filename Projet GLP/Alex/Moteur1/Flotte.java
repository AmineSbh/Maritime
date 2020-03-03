package Moteur1;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Sante;
import Donnees_Const_Navire.Capacité;
import Donnees_Const_Navire.Consommation;

public class Flotte {

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	
	public Flotte()
	{
		this.attaque=0;
		this.sante=0;
		this.capacité=0;
		this.consommation=0;
	}
	
	public void AjouterNavireAttaque{
		
	}
	
	public void AjouterNavireTransport{
		
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacité+"\n"+consommation;
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

	public int getCapacité() {
		return capacité;
	}

	public void setCapacité(int capacité) {
		this.capacité = capacité;
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
