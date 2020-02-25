package donnees_navire;

import donnees_joueur.Moral;

public class Equipage {

	private int NombresDeMatelots;
	
	public Equipage() 
	{
		this.NombresDeMatelots=5;
	}
	
	public Equipage(int niveauBateau) 
	{
		int i;
		for(i=1;i<niveauBateau;i++)
		{
			this.NombresDeMatelots+=5;
		}
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

