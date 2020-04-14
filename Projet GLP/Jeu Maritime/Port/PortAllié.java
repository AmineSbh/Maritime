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
		if(getNavireATT().getNiveau()<4)
		{
			getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireATT().getPrix());
			getNavireATT().setNiveau(getNavireATT().getNiveau()+1);
		}
	}
	
	public void Am�liorerNavireTransport()
	{
		if(getNavireTransport().getNiveau()<4)
		{
			getDonn�esPort().setGold(getDonn�esPort().getGold()-getNavireTransport().getPrix());
			getNavireTransport().setNiveau(getNavireTransport().getNiveau()+1);
		}
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
	
	
	//Ajouter/Supprimr marchandise
	public void AjouterOr(int valeur) {
		if(getFlotte().getCalle().getCapacit�() <= getFlotte().getCalle().getCapacit�Totale()-valeur  && getDonn�esPort().getGold()>=valeur) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setOr(getFlotte().getCalle().getOr()+valeur);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()+valeur);
			/* On modifie l'or du port*/
			getDonn�esPort().setGold(getDonn�esPort().getGold()-valeur);
		}
	}
	
	public void AjouterFood(int Food) {
		if(getFlotte().getCalle().getCapacit�() <= getFlotte().getCalle().getCapacit�Totale()-Food  && getDonn�esPort().getFood()>=Food) {
			/* On modifie la nourriture de la calle*/
			getFlotte().getCalle().setFood(getFlotte().getCalle().getFood()+Food);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()+Food);
			/* On modifie la nourriture du port*/
			getDonn�esPort().setFood(getDonn�esPort().getFood()-Food);
		}
	}
	
	public void AjouterWood(int Wood) {
		if(getFlotte().getCalle().getCapacit�() <= getFlotte().getCalle().getCapacit�Totale()-Wood  && getDonn�esPort().getWood()>=Wood) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setWood(getFlotte().getCalle().getWood()+Wood);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()+Wood);
			/* On modifie l'or du port*/
			getDonn�esPort().setWood(getDonn�esPort().getWood()-Wood);
		}
	}
	
	public void AjouterSteel(int Steel) {
		if(getFlotte().getCalle().getCapacit�() <= getFlotte().getCalle().getCapacit�Totale()-Steel  && getDonn�esPort().getSteel()>=Steel) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setSteel(getFlotte().getCalle().getSteel()+Steel);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()+Steel);
			/* On modifie l'or du port*/
			getDonn�esPort().setSteel(getDonn�esPort().getSteel()-Steel);
		}
	}
	
	
	
	public void SupprimerOr(int valeur) {
		if(0 <= getFlotte().getCalle().getCapacit�()-valeur && 0<=getFlotte().getCalle().getOr()-valeur) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setOr(getFlotte().getCalle().getOr()-valeur);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()-valeur);
			/* On modifie l'or du port*/
			getDonn�esPort().setGold(getDonn�esPort().getGold()+valeur);
		}
	}
	
	public void SupprimerFood(int Food) {
		if(0 <= getFlotte().getCalle().getCapacit�()-Food && 0<=getFlotte().getCalle().getFood()-Food) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setFood(getFlotte().getCalle().getFood()-Food);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()-Food);
			/* On modifie l'or du port*/
			getDonn�esPort().setFood(getDonn�esPort().getFood()+Food);
		}
	}
	
	public void SupprimerWood(int Wood) {
		if(0 <= getFlotte().getCalle().getCapacit�()-Wood && 0<=getFlotte().getCalle().getWood()-Wood) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setWood(getFlotte().getCalle().getWood()-Wood);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()-Wood);
			/* On modifie l'or du port*/
			getDonn�esPort().setWood(getDonn�esPort().getWood()+Wood);
		}
	}
	
	public void SupprimerSteel(int Steel) {
		if(0 <= getFlotte().getCalle().getCapacit�()-Steel && 0<=getFlotte().getCalle().getSteel()-Steel) {
			/* On modifie l'or de la calle*/
			getFlotte().getCalle().setSteel(getFlotte().getCalle().getSteel()-Steel);
			/* On modifie la capacit� restante de la calle*/
			getFlotte().getCalle().setCapacit�(getFlotte().getCalle().getCapacit�()-Steel);
			/* On modifie l'or du port*/
			getDonn�esPort().setSteel(getDonn�esPort().getSteel()+Steel);
		}
	}
	

	public int getBateauxDispo() {
		return BateauxDispo;
	}

	public void setBateauxDispo(int bateauxDispo) {
		BateauxDispo = bateauxDispo;
	}
}
