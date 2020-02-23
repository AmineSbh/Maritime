package moteur;

public class NavireAttaque extends Navire {
	
	public NavireAttaque() 
	{
		super();
	}
	
	public NavireAttaque(int NiveauCanon,int nbCanon, int NiveauCoque, int NiveauCale,int NiveauMât, int nbMat,int NiveauNavire,String nomNavire)
	{
		super(NiveauCanon,nbCanon,NiveauCoque,NiveauCale, NiveauMât,nbMat, NiveauNavire,nomNavire);
	}
	
	public void AméliorationCoque(int b)
	{
		if(super.getDéfense().getNiveauCoque()<3)
		{
			super.AméliorationCoque(b);
		}
		else
		{
			System.out.println("L'amélioration de la coque est au maximum pour ce type de bateau");
		}
	}
	
	public void AméliorationCale(int b)
	{
		if(super.getTransport().getNiveauCale()<3)
		{
			super.AméliorationCale(b);
		}
		else
		{
			System.out.println("L'amélioration de la cale est au maximum pour ce type de bateau");
		}
	}

}