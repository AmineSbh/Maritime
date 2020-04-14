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
		if(getNavireATT().getNiveau()<4)
		{
			getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireATT().getPrix());
			getNavireATT().setNiveau(getNavireATT().getNiveau()+1);
		}
	}
	
	public void AméliorerNavireTransport()
	{
		if(getNavireTransport().getNiveau()<4)
		{
			getDonnéesPort().setGold(getDonnéesPort().getGold()-getNavireTransport().getPrix());
			getNavireTransport().setNiveau(getNavireTransport().getNiveau()+1);
		}
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
	
	
	//Ajouter/Supprimr marchandise
	public void AjouterOr(int valeur) {
		if(getFlotte().getCalle().getCapacité() <= getFlotte().getCalle().getCapacitéTotale()-valeur  && getDonnéesPort().getGold()>=valeur) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setOr(getFlotte().getCalle().getOr()+valeur);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()+valeur);
			/* On modifie l'or du port*/
			getDonnéesPort().setGold(getDonnéesPort().getGold()-valeur);
		}
	}
	
	public void AjouterFood(int Food) {
		if(getFlotte().getCalle().getCapacité() <= getFlotte().getCalle().getCapacitéTotale()-Food  && getDonnéesPort().getFood()>=Food) {
			/* On modifie la nourriture de la calle*/
			getFlotte().getCalle().setFood(getFlotte().getCalle().getFood()+Food);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()+Food);
			/* On modifie la nourriture du port*/
			getDonnéesPort().setFood(getDonnéesPort().getFood()-Food);
		}
	}
	
	public void AjouterWood(int Wood) {
		if(getFlotte().getCalle().getCapacité() <= getFlotte().getCalle().getCapacitéTotale()-Wood  && getDonnéesPort().getWood()>=Wood) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setWood(getFlotte().getCalle().getWood()+Wood);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()+Wood);
			/* On modifie l'or du port*/
			getDonnéesPort().setWood(getDonnéesPort().getWood()-Wood);
		}
	}
	
	public void AjouterSteel(int Steel) {
		if(getFlotte().getCalle().getCapacité() <= getFlotte().getCalle().getCapacitéTotale()-Steel  && getDonnéesPort().getSteel()>=Steel) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setSteel(getFlotte().getCalle().getSteel()+Steel);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()+Steel);
			/* On modifie l'or du port*/
			getDonnéesPort().setSteel(getDonnéesPort().getSteel()-Steel);
		}
	}
	
	
	
	public void SupprimerOr(int valeur) {
		if(0 <= getFlotte().getCalle().getCapacité()-valeur && 0<=getFlotte().getCalle().getOr()-valeur) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setOr(getFlotte().getCalle().getOr()-valeur);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()-valeur);
			/* On modifie l'or du port*/
			getDonnéesPort().setGold(getDonnéesPort().getGold()+valeur);
		}
	}
	
	public void SupprimerFood(int Food) {
		if(0 <= getFlotte().getCalle().getCapacité()-Food && 0<=getFlotte().getCalle().getFood()-Food) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setFood(getFlotte().getCalle().getFood()-Food);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()-Food);
			/* On modifie l'or du port*/
			getDonnéesPort().setFood(getDonnéesPort().getFood()+Food);
		}
	}
	
	public void SupprimerWood(int Wood) {
		if(0 <= getFlotte().getCalle().getCapacité()-Wood && 0<=getFlotte().getCalle().getWood()-Wood) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setWood(getFlotte().getCalle().getWood()-Wood);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()-Wood);
			/* On modifie l'or du port*/
			getDonnéesPort().setWood(getDonnéesPort().getWood()+Wood);
		}
	}
	
	public void SupprimerSteel(int Steel) {
		if(0 <= getFlotte().getCalle().getCapacité()-Steel && 0<=getFlotte().getCalle().getSteel()-Steel) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setSteel(getFlotte().getCalle().getSteel()-Steel);
			/* On modifie la capacité restante de la calle*/
			getFlotte().getCalle().setCapacité(getFlotte().getCalle().getCapacité()-Steel);
			/* On modifie l'or du port*/
			getDonnéesPort().setSteel(getDonnéesPort().getSteel()+Steel);
		}
	}
	

	public int getBateauxDispo() {
		return BateauxDispo;
	}

	public void setBateauxDispo(int bateauxDispo) {
		BateauxDispo = bateauxDispo;
	}
}
