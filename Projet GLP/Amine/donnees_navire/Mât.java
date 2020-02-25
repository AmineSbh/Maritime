package donnees_navire;

public class Mât {

	private int NiveauMât;
	private int NombresMâts;
	private double Vitesse;
	
	public Mât() {
		this.NiveauMât=1;
		this.NombresMâts=1;
		this.Vitesse=8.0;
	}
	
	public Mât(int niveau,int nbMat) {
		this.NiveauMât=niveau;
		this.NombresMâts=nbMat;
		double a=niveau*0.7;
		a=a*nbMat;
		this.Vitesse=8.0*a;
	}

	public int getNiveauMât() {
		return NiveauMât;
	}
	
	public void setNiveauMât(int niveau)
	{
		this.NiveauMât=niveau;
		double a=niveau*0.7;
		this.Vitesse=8.0*a;
	}
	
	public double Vitesse() {
		return Vitesse;
	}
	
	public void setVitesse(int niveau)
	{
		double a=niveau*0.7;
		this.Vitesse=8.0*a;
	}

	public int getNombresMâts() {
		return NombresMâts;
	}
	
	public void setNombresMâts(int nbMâts)
	{
		this.NombresMâts=nbMâts;
		double a=0.7*nbMâts;
		this.Vitesse=8.0*a;
	}
}

