package donnees_navire;

import donnees_joueur.Nourriture;

public class Capacit�Cale {
	private int NiveauCapacit�;
	private int Bois;
	private Nourriture nourriture;
	private int m�taux;
	
	
	public Capacit�Cale()
	{
		this.Bois= 50;
		this.m�taux=30;
		this.nourriture=new Nourriture();
	}

	public Capacit�Cale(int niveau)
	{
		this.Bois=50*niveau;
		this.m�taux=30*niveau;
		this.nourriture=new Nourriture(niveau);
	}
	
	public int getBois() 
	{
		return Bois;
	}
	
	public Nourriture getNourriture() 
	{
		return nourriture;
	}
	
	public int getM�taux() 
	{
		return m�taux;
	}

	public int getNiveauCapacit�() {
		return NiveauCapacit�;
	}

	public void setNiveauCapacit�(int niveauCapacit�) {
		this.Bois=50*niveauCapacit�;
		this.m�taux=30*niveauCapacit�;
		this.nourriture=new Nourriture(niveauCapacit�);
	}
}

