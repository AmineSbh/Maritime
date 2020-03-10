package DonnéesPort;

public class Flotte {

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	private int NavireAttaque;
	private int NavireTransport;
	
	public Flotte()
	{
		this.attaque=0;
		this.sante=0;
		this.capacité=0;
		this.consommation=0;
		this.NavireAttaque=0;
		this.NavireTransport=0;
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

	public int getNavireAttaque() {
		return NavireAttaque;
	}

	public void setNavireAttaque(int navireAttaque) {
		NavireAttaque = navireAttaque;
	}

	public int getNavireTransport() {
		return NavireTransport;
	}

	public void setNavireTransport(int navireTransport) {
		NavireTransport = navireTransport;
	}
}
