package donnees_joueur;

public class Moral {

	private Nourriture nourriture;
	private int BatailleGagné;
	private int BataillePerdu;
	private int moral;
	
	public Moral() {
		this.nourriture=new Nourriture();
		this.BatailleGagné=0;
		this.BataillePerdu=0;
		this.moral= nourriture.getBoisson()+nourriture.getPain()+nourriture.getPoisson()+(2*nourriture.getViande());
	}
	
	public Moral(int batailleGagné, int bataillePerdu) {
		this.nourriture=new Nourriture();
		this.BatailleGagné=batailleGagné;
		this.BataillePerdu=bataillePerdu;
		this.moral= nourriture.getBoisson()+nourriture.getPain()+nourriture.getPoisson()+(2*nourriture.getViande())+(10*batailleGagné)-(10*bataillePerdu);
	}

	public int getBatailleGagné() {
		return BatailleGagné;
	}

	public int getBataillePerdu() {
		return BataillePerdu;
	}

	public int getMoral() {
		return moral;
	}
}

