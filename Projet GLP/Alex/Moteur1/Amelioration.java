package Moteur1;

import Moteur1.Navire;

public class Amelioration {
	
	private Navire navire;
		
	public Amelioration(Navire navire)
	{
		this.navire=navire;
	}
		
	public int CoutAttaque()
	{
		int cout = 1500;
		int i;
		for(i=1;i<navire.getNiveau();i++)
		{
			cout= cout*3;
		}
		return cout;
	}
	
	public int CoutTransport()
	{
		int cout = 1000;
		int i;
		for(i=1;i<navire.getNiveau();i++)
		{
			cout= cout*3;
		}
		return cout;
	}
	
	public void AméliorationNavire()
	{
		if(1<2)
		{
			//ressource - cout
			navire.setNiveau(navire.getNiveau()+1);
		}
		
		
	}
}
