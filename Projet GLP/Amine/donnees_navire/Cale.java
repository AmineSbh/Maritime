package donnees_navire;

public class Cale {

	private int NiveauCale;
	private String matériel;
	private String[] matériaux= {"Bois","Bois Amélioré","métal"};
	private CapacitéCale capacité;
	
	public Cale() {
		this.NiveauCale=1;
		this.matériel=this.matériaux[0];
		this.capacité=new CapacitéCale();
	}
	
	public Cale(int niveau)
	{
		this.NiveauCale=niveau;
		this.matériel=this.matériaux[niveau-1];
		this.capacité=new CapacitéCale(niveau);
	}

	public int getNiveauCale() {
		return NiveauCale;
	}
	
	public void setNiveauCale(int niveau)
	{
		this.NiveauCale=niveau;
		this.matériel=this.matériaux[niveau-1];
		this.capacité=new CapacitéCale(niveau);
	}

	public String getMatériel() {
		return matériel;
	}

	public CapacitéCale getCapacité() {
		return capacité;
	}
}

