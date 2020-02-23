package donnees_joueur;

public class Moral {

	private Nourriture nourriture;
	private int BatailleGagn�;
	private int BataillePerdu;
	private int moral;
	
	public Moral() {
		this.nourriture=new Nourriture();
		this.BatailleGagn�=0;
		this.BataillePerdu=0;
		this.moral= nourriture.getBoisson()+nourriture.getPain()+nourriture.getPoisson()+(2*nourriture.getViande());
	}
	
	public Moral(int batailleGagn�, int bataillePerdu) {
		this.nourriture=new Nourriture();
		this.BatailleGagn�=batailleGagn�;
		this.BataillePerdu=bataillePerdu;
		this.moral= nourriture.getBoisson()+nourriture.getPain()+nourriture.getPoisson()+(2*nourriture.getViande())+(10*batailleGagn�)-(10*bataillePerdu);
	}

	public int getBatailleGagn�() {
		return BatailleGagn�;
	}

	public int getBataillePerdu() {
		return BataillePerdu;
	}

	public int getMoral() {
		return moral;
	}
}

