package Port;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class PortAllié extends Port{

	private int BateauxDispo;
	private ConstructionNavirePort construction;
	
	public PortAllié(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level,Flotte flotte,NavireAttaque navireAttaque, NavireTransport navireTransport)
	{
		super(name,valeurDeLaVille, gold, wood, steel, food, level,flotte,navireAttaque, navireTransport);
		this.setBateauxDispo(getDonnéesPort().getLevel());
		construction= new ConstructionNavirePort(navireAttaque,navireTransport , flotte);
	}
	
	public void Amélioration()
	{
		
	}
	
	public void AjouterAttaquePort()
	{
		int coutBateauATT=1000;
		
		if(getDonnéesPort().getGold()>coutBateauATT)
		{
			setFlotte(construction.AjouterNavireAttaque(getNavireATT()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()-coutBateauATT);
		}
	}
	
	public void AjouterTransportPort()
	{
		int coutBateauTPORT=1000;

		
		if(getDonnéesPort().getGold()>coutBateauTPORT)
		{
			setFlotte(construction.AjouterNavireTransport(getNavireTransport()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()-coutBateauTPORT);
		}
	}
	
	public void SupprimerNavireTransportPort()
	{
		int coutBateauTPORT=1000;

		
		if(getBateauxDispo()<getDonnéesPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireTransport(getNavireTransport()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()+coutBateauTPORT);
		}
	}
	
	public void SupprimerNavireAttaquePort()
	{
		int coutBateauTPORT=1000;

		
		if(getBateauxDispo()<getDonnéesPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireTransport(getNavireTransport()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()+coutBateauTPORT);
		}
	}
	

	public int getBateauxDispo() {
		return BateauxDispo;
	}

	public void setBateauxDispo(int bateauxDispo) {
		BateauxDispo = bateauxDispo;
	}
}
