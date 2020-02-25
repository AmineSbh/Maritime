package donnees_navire;

public class Cale {

	private int NiveauCale;
	private String mat�riel;
	private String[] mat�riaux= {"Bois","Bois Am�lior�","m�tal"};
	private Capacit�Cale capacit�;
	
	public Cale() {
		this.NiveauCale=1;
		this.mat�riel=this.mat�riaux[0];
		this.capacit�=new Capacit�Cale();
	}
	
	public Cale(int niveau)
	{
		this.NiveauCale=niveau;
		this.mat�riel=this.mat�riaux[niveau-1];
		this.capacit�=new Capacit�Cale(niveau);
	}

	public int getNiveauCale() {
		return NiveauCale;
	}
	
	public void setNiveauCale(int niveau)
	{
		this.NiveauCale=niveau;
		this.mat�riel=this.mat�riaux[niveau-1];
		this.capacit�=new Capacit�Cale(niveau);
	}

	public String getMat�riel() {
		return mat�riel;
	}

	public Capacit�Cale getCapacit�() {
		return capacit�;
	}
}

