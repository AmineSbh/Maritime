package Port;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class PortEnnemi extends Port{

	public PortEnnemi(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level,Flotte flotte,NavireAttaque navireAttaque, NavireTransport navireTransport)
	{
		super(name,valeurDeLaVille, gold, wood, steel, food, level,flotte,navireAttaque, navireTransport);
	}
	
	public Flotte AcheterBois(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(getDonn�esPort().getWood()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setWood(flotte.getCalle().getWood()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+50);
			/* On modifie le bois du port*/
			getDonn�esPort().setWood(getDonn�esPort().getWood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterNourriture(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(getDonn�esPort().getFood()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setFood(flotte.getCalle().getFood()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+50);
			/* On modifie le bois du port*/
			getDonn�esPort().setFood(getDonn�esPort().getFood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterMetaux(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(getDonn�esPort().getSteel()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=50) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setSteel(flotte.getCalle().getSteel()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+50);
			/* On modifie le bois du port*/
			getDonn�esPort().setSteel(getDonn�esPort().getSteel()-100);
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
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()-50);
			/* On modifie le bois du port*/
			getDonn�esPort().setWood(getDonn�esPort().getWood()+100);
		}
		return flotte;
	}
	
	public Flotte VendreNourriture(Flotte flotte) {
		if(flotte.getCalle().getFood()>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setFood(flotte.getCalle().getFood()-100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()+30);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()-70);
			/* On modifie le bois du port*/
			getDonn�esPort().setFood(getDonn�esPort().getFood()+100);
		}
		return flotte;
	}
	
	public Flotte VendreMetaux(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(flotte.getCalle().getSteel()>=50 && Capacit�Restante>=10) {
			/* On modifie les metaux de la calle*/
			flotte.getCalle().setSteel(flotte.getCalle().getSteel()-100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()+110);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+10);
			/* On modifie les metaux du port*/
			getDonn�esPort().setSteel(getDonn�esPort().getSteel()+100);
		}
		return flotte;
	}
	
}
