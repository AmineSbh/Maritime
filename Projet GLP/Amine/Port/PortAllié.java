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
	
	public void Am�liorerNavireAttaque()
	{
		getNavireATT().setNiveau(getNavireATT().getNiveau()+1);
		getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireATT().getPrix());
	}
	
	public void Am�liorerNavireTransport()
	{
		getNavireTransport().setNiveau(getNavireTransport().getNiveau()+1);
		getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireATT().getPrix());
	}
	
	public void AjouterAttaquePort()
	{
			setFlotte(construction.AjouterNavireAttaque(getNavireATT()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireATT().getPrix());
			setBateauxDispo(getBateauxDispo()-1);
	}
	
	
	public void AjouterTransportPort()
	{
			setFlotte(construction.AjouterNavireTransport(getNavireTransport()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireTransport().getPrix());
			setBateauxDispo(getBateauxDispo()-1);
	}
	
	public void SupprimerNavireTransportPort()
	{
		if(getBateauxDispo()<getDonn�esPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireTransport(getNavireTransport()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()+getNavireTransport().getPrix());
			setBateauxDispo(getBateauxDispo()+1);
		}
	}
	
	public void SupprimerNavireAttaquePort()
	{
		if(getBateauxDispo()<getDonn�esPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireAttaque(getNavireATT()));
			getDonn�esPort().setGold(getDonn�esPort().getGold()+getNavireATT().getPrix());
			setBateauxDispo(getBateauxDispo()+1);
		}
		
	}
	

	public int getBateauxDispo() {
		return BateauxDispo;
	}

	public void setBateauxDispo(int bateauxDispo) {
		BateauxDispo = bateauxDispo;
	}
}
