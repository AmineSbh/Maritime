package donnees_navire;

public class M�t {

	private int NiveauM�t;
	private int NombresM�ts;
	private double Vitesse;
	
	public M�t() {
		this.NiveauM�t=1;
		this.NombresM�ts=1;
		this.Vitesse=8.0;
	}
	
	public M�t(int niveau,int nbMat) {
		this.NiveauM�t=niveau;
		this.NombresM�ts=nbMat;
		double a=niveau*0.7;
		a=a*nbMat;
		this.Vitesse=8.0*a;
	}

	public int getNiveauM�t() {
		return NiveauM�t;
	}
	
	public void setNiveauM�t(int niveau)
	{
		this.NiveauM�t=niveau;
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

	public int getNombresM�ts() {
		return NombresM�ts;
	}
	
	public void setNombresM�ts(int nbM�ts)
	{
		this.NombresM�ts=nbM�ts;
		double a=0.7*nbM�ts;
		this.Vitesse=8.0*a;
	}
}

