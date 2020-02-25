package moteur;

public class Amelioration {
	
	private Navire navire;
	
	public Amelioration(Navire navire)
	{
		this.navire=navire;
	}
	
	public int CoutCoque()
	{
		int coutCoque = 1000;
		int i;
		for(i=1;i<navire.getDéfense().getNiveauCoque();i++)
		{
			coutCoque= coutCoque*2;
		}
		return coutCoque;
	}
	
	public int CoutCale()
	{
		int coutCale = 500;
		int i;
		for(i=1;i<navire.getTransport().getNiveauCale();i++)
		{
			coutCale= coutCale*2;
		}
		return coutCale;
	}
	
	public int CoutMat()
	{
		int coutMat = 600;
		int i;
		for(i=1;i<navire.getVitesse().getNiveauMât();i++)
		{
			coutMat= coutMat*2;
		}
		return coutMat;
	}
	
	public int CoutCanon()
	{
		int coutCanon = 100;
		int i;
		for(i=1;i<navire.getAttaque().getNiveauCanon();i++)
		{
			coutCanon= coutCanon*3;
		}
		return coutCanon;
	}
	
	public void AméliorationCanon(int a, int b)
	{
		if(a==1)
		{
			if(b==1)
			{
				this.Attaque.setNiveauCanon(Attaque.getNiveauCanon()+1);
				if( ressource.getOr() >= CoutCanon() && Attaque.getNiveauCanon()<5)
				{
					ressource.setOr(ressource.getOr()-CoutCanon());
				}
				else
				{
					System.out.println("Vous n'avez pas assez de ressource");
					this.Attaque.setNiveauCanon(Attaque.getNiveauCanon()-1);
				}
			}
			else if(b==0 && ressource.getOr() >= CoutCanon())
			{
				if(Attaque.getNombresCanons()<5)
				{
					this.Attaque.setNombresCanons(Attaque.getNombresCanons()+1);
					ressource.setOr(ressource.getOr()-CoutCanon());
				}
			}
		}
	}
	
	public void AméliorationCoque(int b)
	{
		if(b==1)
		{
			this.Défense.setNiveauCoque(Défense.getNiveauCoque()+1);
			if( ressource.getOr() >= CoutCoque() && Défense.getNiveauCoque()<5)
			{
				ressource.setOr(ressource.getOr()-CoutCoque());
			}
			else
			{
				System.out.println("Vous n'avez pas assez de ressource");
				this.Défense.setNiveauCoque(Défense.getNiveauCoque()-1);
			}
		}
	}
	
	public void AméliorationCale(int b)
	{
		if(b==1)
		{
			this.Transport.setNiveauCale(Transport.getNiveauCale()+1);
			if( ressource.getOr() >= CoutCale() && Transport.getNiveauCale()<5)
			{
				ressource.setOr(ressource.getOr()-CoutCale());
			}
			else
			{
				System.out.println("Vous n'avez pas assez de ressource");
				this.Transport.setNiveauCale(Transport.getNiveauCale()-1);
			}
		}
	}
	
	public void AméliorationMât(int a, int b)
	{
		if(a==1)
		{
			if(b==1)
			{
				this.Vitesse.setNiveauMât(Vitesse.getNiveauMât()+1);
				if( ressource.getOr() >= CoutMat() && Vitesse.getNiveauMât()<5)
				{
					ressource.setOr(ressource.getOr()-CoutMat());
				}
				else
				{
					System.out.println("Vous n'avez pas assez de ressource");
					this.Vitesse.setNiveauMât(Vitesse.getNiveauMât()-1);
				}
			}
			else if(b==0 && ressource.getOr() >= CoutMat())
			{
				if(Vitesse.getNiveauMât()<5)
				{
					this.Vitesse.setNombresMâts(Vitesse.getNombresMâts()+1);
					ressource.setOr(ressource.getOr()-CoutMat());
				}
			}
		}
	}

}
