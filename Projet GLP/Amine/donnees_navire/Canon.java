package donnees_navire;

public class Canon {

	private int NiveauCanon;
	private int NombresCanons;
	private double Puissance;
	
	public Canon() {
		this.NiveauCanon=1;
		this.NombresCanons=1;
		this.Puissance=10.0;
	}
	
	public Canon(int niveau,int nbCanon) {
		this.NiveauCanon=niveau;
		this.NombresCanons=nbCanon;
		double a=niveau*2.5;
		a=a*nbCanon;
		this.Puissance=10.0*a;
	}
	
	public int getNiveauCanon() 
	{
		return NiveauCanon;
	}
	
	public void setNiveauCanon(int niveau)
	{
		this.NiveauCanon=niveau;
		double a=niveau*2.5;
		this.Puissance=10.0*a;
	}
	
	public int getNombresCanons() 
	{
		return NombresCanons;
	}
	
	public void setNombresCanons(int nbCanon)
	{
		this.NombresCanons=nbCanon;
		double a=2.5*nbCanon;
		this.Puissance=10.0*a;
	}
	
	public double getPuissance() 
	{
		return Puissance;
	}
	
	public void setPuissance(int niveau , int nbCanon)
	{
		double a=niveau*2.5;
		a=a*nbCanon;
		this.Puissance=10.0*a;
	}
}

