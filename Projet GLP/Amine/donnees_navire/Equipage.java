package donnees_navire;

import donnees_joueur.Moral;

public class Equipage {

	private Moral moral;
	private int NombresDeMatelots;
	
	public Equipage() 
	{
		this.moral=new Moral();
		this.NombresDeMatelots=5;
	}
	
	public Equipage(int niveauBateau,int batailleGagn�, int bataillePerdu) 
	{
		this.moral=new Moral(batailleGagn�, bataillePerdu);
		int i;
		for(i=1;i<niveauBateau;i++)
		{
			this.NombresDeMatelots+=5;
		}
	}

	public Moral getMoral() {
		return moral;
	}
	
	public void setMoral(int batailleGagn�, int bataillePerdu)
	{
		this.moral=new Moral(batailleGagn�, bataillePerdu);
	}

	public int getNombresDeMatelots() {
		return NombresDeMatelots;
	}
	
	public void setNombresDeMatelots(int niveauBateau)
	{
		int i;
		for(i=0;i<niveauBateau;i++)
		{
			this.NombresDeMatelots+=5;
		}
	}
}

