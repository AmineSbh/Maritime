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
		for(i=1;i<navire.getD�fense().getNiveauCoque();i++)
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
		for(i=1;i<navire.getVitesse().getNiveauM�t();i++)
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
	
	public void Am�liorationCanon(int a, int b)
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
	
	public void Am�liorationCoque(int b)
	{
		if(b==1)
		{
			this.D�fense.setNiveauCoque(D�fense.getNiveauCoque()+1);
			if( ressource.getOr() >= CoutCoque() && D�fense.getNiveauCoque()<5)
			{
				ressource.setOr(ressource.getOr()-CoutCoque());
			}
			else
			{
				System.out.println("Vous n'avez pas assez de ressource");
				this.D�fense.setNiveauCoque(D�fense.getNiveauCoque()-1);
			}
		}
	}
	
	public void Am�liorationCale(int b)
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
	
	public void Am�liorationM�t(int a, int b)
	{
		if(a==1)
		{
			if(b==1)
			{
				this.Vitesse.setNiveauM�t(Vitesse.getNiveauM�t()+1);
				if( ressource.getOr() >= CoutMat() && Vitesse.getNiveauM�t()<5)
				{
					ressource.setOr(ressource.getOr()-CoutMat());
				}
				else
				{
					System.out.println("Vous n'avez pas assez de ressource");
					this.Vitesse.setNiveauM�t(Vitesse.getNiveauM�t()-1);
				}
			}
			else if(b==0 && ressource.getOr() >= CoutMat())
			{
				if(Vitesse.getNiveauM�t()<5)
				{
					this.Vitesse.setNombresM�ts(Vitesse.getNombresM�ts()+1);
					ressource.setOr(ressource.getOr()-CoutMat());
				}
			}
		}
	}

}
