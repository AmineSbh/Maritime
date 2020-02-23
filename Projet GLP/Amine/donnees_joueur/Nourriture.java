package donnees_joueur;

public class Nourriture {

	private int Viande;
	private int Boisson;
	private int Pain;
	private int Poisson;
	
	public Nourriture()
	{
		this.Viande=10;
		this.Boisson=10;
		this.Pain=10;
		this.Poisson=10;
	}
	
	public Nourriture(int niveau)
	{
		this.Viande=10*niveau;
		this.Boisson=10*niveau;
		this.Pain=10*niveau;
		this.Poisson=10*niveau;
	}

	public int getViande() {
		return Viande;
	}
	
	public void setViande(int Viande) {
		this.Viande=Viande;
	}

	public int getBoisson() {
		return Boisson;
	}

	public int getPain() {
		return Pain;
	}

	public int getPoisson() {
		return Poisson;
	}
}

