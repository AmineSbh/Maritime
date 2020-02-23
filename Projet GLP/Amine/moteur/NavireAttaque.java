package moteur;

public class NavireAttaque extends Navire {
	
	public NavireAttaque() 
	{
		super();
	}
	
	public NavireAttaque(int NiveauCanon,int nbCanon, int NiveauCoque, int NiveauCale,int NiveauM�t, int nbMat,int NiveauNavire,String nomNavire)
	{
		super(NiveauCanon,nbCanon,NiveauCoque,NiveauCale, NiveauM�t,nbMat, NiveauNavire,nomNavire);
	}
	
	public void Am�liorationCoque(int b)
	{
		if(super.getD�fense().getNiveauCoque()<3)
		{
			super.Am�liorationCoque(b);
		}
		else
		{
			System.out.println("L'am�lioration de la coque est au maximum pour ce type de bateau");
		}
	}
	
	public void Am�liorationCale(int b)
	{
		if(super.getTransport().getNiveauCale()<3)
		{
			super.Am�liorationCale(b);
		}
		else
		{
			System.out.println("L'am�lioration de la cale est au maximum pour ce type de bateau");
		}
	}

}