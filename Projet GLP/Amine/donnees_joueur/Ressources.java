package donnees_joueur;

public class Ressources {
	
	private int or;
	private int bois;
	private int m�taux;
	private Nourriture nourriture;
	private int BatailleGagn�es;
	private int BataillePerdues;
	
	public Ressources()
	{
		this.or=1000;
		this.bois=100;
		this.m�taux=100;
		this.nourriture=new Nourriture();
		this.BatailleGagn�es=0;
		this.BataillePerdues=0;
	}

	public int getOr() {
		return or;
	}

	public void setOr(int or) {
		this.or = or;
	}

	public int getBois() {
		return bois;
	}

	public void setBois(int bois) {
		this.bois = bois;
	}

	public int getM�taux() {
		return m�taux;
	}

	public void setM�taux(int m�taux) {
		this.m�taux = m�taux;
	}

	public Nourriture getNourriture() {
		return nourriture;
	}

	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}

	public int getBatailleGagn�es() {
		return BatailleGagn�es;
	}

	public void setBatailleGagn�es(int batailleGagn�es) {
		BatailleGagn�es = batailleGagn�es;
	}

	public int getBataillePerdues() {
		return BataillePerdues;
	}

	public void setBataillePerdues(int bataillePerdues) {
		BataillePerdues = bataillePerdues;
	}

}
