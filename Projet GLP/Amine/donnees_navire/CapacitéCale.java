package donnees_navire;

import donnees_joueur.Nourriture;

public class CapacitéCale {
	private int NiveauCapacité;
	private int Bois;
	private Nourriture nourriture;
	private int métaux;
	
	
	public CapacitéCale()
	{
		this.Bois= 50;
		this.métaux=30;
		this.nourriture=new Nourriture();
	}

	public CapacitéCale(int niveau)
	{
		this.Bois=50*niveau;
		this.métaux=30*niveau;
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
	
	public int getMétaux() 
	{
		return métaux;
	}

	public int getNiveauCapacité() {
		return NiveauCapacité;
	}

	public void setNiveauCapacité(int niveauCapacité) {
		this.Bois=50*niveauCapacité;
		this.métaux=30*niveauCapacité;
		this.nourriture=new Nourriture(niveauCapacité);
	}
}

