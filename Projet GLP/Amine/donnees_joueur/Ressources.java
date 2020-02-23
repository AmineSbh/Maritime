package donnees_joueur;

public class Ressources {
	
	private int or;
	private int bois;
	private int métaux;
	private Nourriture nourriture;
	private int BatailleGagnées;
	private int BataillePerdues;
	
	public Ressources()
	{
		this.or=1000;
		this.bois=100;
		this.métaux=100;
		this.nourriture=new Nourriture();
		this.BatailleGagnées=0;
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

	public int getMétaux() {
		return métaux;
	}

	public void setMétaux(int métaux) {
		this.métaux = métaux;
	}

	public Nourriture getNourriture() {
		return nourriture;
	}

	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}

	public int getBatailleGagnées() {
		return BatailleGagnées;
	}

	public void setBatailleGagnées(int batailleGagnées) {
		BatailleGagnées = batailleGagnées;
	}

	public int getBataillePerdues() {
		return BataillePerdues;
	}

	public void setBataillePerdues(int bataillePerdues) {
		BataillePerdues = bataillePerdues;
	}

}
