package Port;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class PortAlli� extends Port{

	private int BateauxDispo;
	private ConstructionNavirePort construction;
	
	public PortAlli�(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level,Flotte flotte,NavireAttaque navireAttaque, NavireTransport navireTransport)
	{
		super(name,valeurDeLaVille, gold, wood, steel, food, level,flotte,navireAttaque, navireTransport);
		this.setBateauxDispo(getDonn�esPort().getLevel());
		construction= new ConstructionNavirePort(navireAttaque,navireTransport , flotte);
	}
	
	public void Am�lioration()
	{
		
	}
	
	public Flotte AjouterAttaquePort()
	{
		int coutBateauATT=1000;
		
		if(getDonn�esPort().getGold()>coutBateauATT)
		{
			setFlotte(construction.AjouterNavireAttaque(getNavireATT()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()-coutBateauATT);
		}
		return getFlotte();
	}
	
	public Flotte AjouterTransportPort()
	{
		int coutBateauTPORT=1000;

		
		if(getDonn�esPort().getGold()>coutBateauTPORT)
		{
			setFlotte(construction.AjouterNavireTransport(getNavireTransport()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()-coutBateauTPORT);
		}
		return getFlotte();
	}
	

	public int getBateauxDispo() {
		return BateauxDispo;
	}

	public void setBateauxDispo(int bateauxDispo) {
		BateauxDispo = bateauxDispo;
	}
}
