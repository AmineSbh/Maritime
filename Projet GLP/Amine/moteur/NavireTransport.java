package moteur;

public class NavireTransport extends Navire{

	public NavireTransport() {
		super();
	}
	
	public NavireTransport(int NiveauCanon,int nbCanon, int NiveauCoque, int NiveauCale,int NiveauMât, int nbMat,int NiveauNavire,String nomNavire)
	{
		super(NiveauCanon,nbCanon,NiveauCoque,NiveauCale, NiveauMât,nbMat, NiveauNavire,nomNavire);
	}
	
	public void AméliorationCanon(int a, int b)
	{
		if(super.getAttaque().getNiveauCanon()<3 || super.getAttaque().getNombresCanons()<3)
		{
			super.AméliorationCanon(a,b);
		}
		else
		{
			System.out.println("L'amélioration des canons est au maximum pour ce type de bateau");
		}
	}
	
	public void AméliorationMât(int a, int b)
	{
		if(super.getVitesse().getNiveauMât()<3 || super.getVitesse().getNombresMâts()<3)
		{
			super.AméliorationMât(a,b);
		}
		else
		{
			System.out.println("L'amélioration des mâts est au maximum pour ce type de bateau");
		}
	}

}

