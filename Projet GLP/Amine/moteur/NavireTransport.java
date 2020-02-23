package moteur;

public class NavireTransport extends Navire{

	public NavireTransport() {
		super();
	}
	
	public NavireTransport(int NiveauCanon,int nbCanon, int NiveauCoque, int NiveauCale,int NiveauM�t, int nbMat,int NiveauNavire,String nomNavire)
	{
		super(NiveauCanon,nbCanon,NiveauCoque,NiveauCale, NiveauM�t,nbMat, NiveauNavire,nomNavire);
	}
	
	public void Am�liorationCanon(int a, int b)
	{
		if(super.getAttaque().getNiveauCanon()<3 || super.getAttaque().getNombresCanons()<3)
		{
			super.Am�liorationCanon(a,b);
		}
		else
		{
			System.out.println("L'am�lioration des canons est au maximum pour ce type de bateau");
		}
	}
	
	public void Am�liorationM�t(int a, int b)
	{
		if(super.getVitesse().getNiveauM�t()<3 || super.getVitesse().getNombresM�ts()<3)
		{
			super.Am�liorationM�t(a,b);
		}
		else
		{
			System.out.println("L'am�lioration des m�ts est au maximum pour ce type de bateau");
		}
	}

}

