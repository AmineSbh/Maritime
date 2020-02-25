package donnees_navire;

public class Coque {

	private int NiveauCoque;
	private String mat�riel;
	private String[] mat�riaux= {"Bois","Bois Am�lior�","m�tal"};
	private double Resistance;
	
	public Coque() {
		this.NiveauCoque=1;
		this.mat�riel=this.mat�riaux[0];
		this.Resistance=20.0;
	}
	
	public Coque(int niveau) {
		this.NiveauCoque=niveau;
		this.mat�riel=this.mat�riaux[niveau-1];
		double a=niveau*2.5;
		this.Resistance=20.0*a;
	}

	public double getResistance() {
		return Resistance;
	}
	
	public void setResistance(int niveau)
	{
		double a=niveau*2.5;
		this.Resistance=20.0*a;
	}

	public String getMat�riel() {
		return mat�riel;
	}

	public int getNiveauCoque() {
		return NiveauCoque;
	}
	
	public void setNiveauCoque(int niveau)
	{
		this.NiveauCoque=niveau;
		this.mat�riel=this.mat�riaux[niveau-1];
		double a=niveau*2.5;
		this.Resistance=20.0*a;
	}
}