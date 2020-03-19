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
	
	public void AméliorerNavireAttaque()
	{
		getNavireATT().setNiveau(getNavireATT().getNiveau()+1);
		getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireATT().getPrix());
	}
	
	public void AméliorerNavireTransport()
	{
		getNavireTransport().setNiveau(getNavireTransport().getNiveau()+1);
		getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireATT().getPrix());
	}
	
	public void AjouterAttaquePort()
	{
			setFlotte(construction.AjouterNavireAttaque(getNavireATT()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireATT().getPrix());
			setBateauxDispo(getBateauxDispo()-1);
	}
	
	
	public void AjouterTransportPort()
	{
			setFlotte(construction.AjouterNavireTransport(getNavireTransport()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireTransport().getPrix());
			setBateauxDispo(getBateauxDispo()-1);
	}
	
	public void SupprimerNavireTransportPort()
	{
		if(getBateauxDispo()<getDonnéesPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireTransport(getNavireTransport()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()+getNavireTransport().getPrix());
			setBateauxDispo(getBateauxDispo()+1);
		}
	}
	
	public void SupprimerNavireAttaquePort()
	{
		if(getBateauxDispo()<getDonnéesPort().getLevel())
		{
			setFlotte(construction.SupprimerNavireAttaque(getNavireATT()));
			getDonnéesPort().setGold(getDonnéesPort().getGold()+getNavireATT().getPrix());
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
