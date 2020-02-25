package donnees_navire;

public class Coque {

	private int NiveauCoque;
	private String matériel;
	private String[] matériaux= {"Bois","Bois Amélioré","métal"};
	private double Resistance;
	
	public Coque() {
		this.NiveauCoque=1;
		this.matériel=this.matériaux[0];
		this.Resistance=20.0;
	}
	
	public Coque(int niveau) {
		this.NiveauCoque=niveau;
		this.matériel=this.matériaux[niveau-1];
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

	public String getMatériel() {
		return matériel;
	}

	public int getNiveauCoque() {
		return NiveauCoque;
	}
	
	public void setNiveauCoque(int niveau)
	{
		this.NiveauCoque=niveau;
		this.matériel=this.matériaux[niveau-1];
		double a=niveau*2.5;
		this.Resistance=20.0*a;
	}
}