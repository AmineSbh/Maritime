package Port;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class PortEnnemi extends Port{

	public PortEnnemi(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level,Flotte flotte,NavireAttaque navireAttaque, NavireTransport navireTransport)
	{
		super(name,valeurDeLaVille, gold, wood, steel, food, level,flotte,navireAttaque, navireTransport);
	}
	
	public Flotte AcheterBois(Flotte flotte) {
		int CapacitéRestante = flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité();
		if(getDonnéesPort().getWood()-100>=0 && flotte.getCalle().getOr()>=50 && CapacitéRestante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setWood(flotte.getCalle().getWood()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()+50);
			/* On modifie le bois du port*/
			getDonnéesPort().setWood(getDonnéesPort().getWood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterNourriture(Flotte flotte) {
		int CapacitéRestante = flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité();
		if(getDonnéesPort().getFood()-100>=0 && flotte.getCalle().getOr()>=50 && CapacitéRestante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setFood(flotte.getCalle().getFood()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()+50);
			/* On modifie le bois du port*/
			getDonnéesPort().setFood(getDonnéesPort().getFood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterMetaux(Flotte flotte) {
		int CapacitéRestante = flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité();
		if(getDonnéesPort().getSteel()-100>=0 && flotte.getCalle().getOr()>=50 && CapacitéRestante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setSteel(flotte.getCalle().getSteel()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()+50);
			/* On modifie le bois du port*/
			getDonnéesPort().setSteel(getDonnéesPort().getSteel()-100);
		}
		return flotte;
	}
	
	//--------------------------------------------VENDRE MARCHANDISE---------------------------------------//
	//--------------------------------------------VENDRE MARCHANDISE---------------------------------------//
	//--------------------------------------------VENDRE MARCHANDISE---------------------------------------//
	public Flotte VendreBois(Flotte flotte) {
		if(flotte.getCalle().getWood()>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setWood(flotte.getCalle().getWood()-100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()+50);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()-50);
			/* On modifie le bois du port*/
			getDonnéesPort().setWood(getDonnéesPort().getWood()+100);
		}
		return flotte;
	}
	
	public Flotte VendreNourriture(Flotte flotte) {
		if(flotte.getCalle().getFood()>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setFood(flotte.getCalle().getFood()-100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()+30);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()-70);
			/* On modifie le bois du port*/
			getDonnéesPort().setFood(getDonnéesPort().getFood()+100);
		}
		return flotte;
	}
	
	public Flotte VendreMetaux(Flotte flotte) {
		int CapacitéRestante = flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité();
		if(flotte.getCalle().getSteel()>=50 && CapacitéRestante>=10) {
			/* On modifie les metaux de la calle*/
			flotte.getCalle().setSteel(flotte.getCalle().getSteel()-100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()+110);
			/* On modifie la capcité de la calle*/
			flotte.getCalle().setCapacité(flotte.getCalle().getCapacité()+10);
			/* On modifie les metaux du port*/
			getDonnéesPort().setSteel(getDonnéesPort().getSteel()+100);
		}
		return flotte;
	}
	
}
