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
		if(getDonn�esPort().getWood()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setWood(flotte.getCalle().getWood()+100);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie le bois du port*/
			getDonn�esPort().setWood(getDonn�esPort().getWood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterNourriture(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(getDonn�esPort().getFood()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setFood(flotte.getCalle().getFood()+100);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie le bois du port*/
			getDonn�esPort().setFood(getDonn�esPort().getFood()-100);
		}
		return flotte;
	}
	
	public Flotte AcheterMetaux(Flotte flotte) {
		int Capacit�Restante = flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�();
		if(getDonn�esPort().getSteel()-100>=0 && flotte.getCalle().getOr()>=50 && Capacit�Restante>=100) {
			/* On modifie le bois de la calle*/
			flotte.getCalle().setSteel(flotte.getCalle().getSteel()+100);
			/* On modifie la capcit� de la calle*/
			flotte.getCalle().setCapacit�(flotte.getCalle().getCapacit�()+100);
			/* On modifie l'or de la calle*/
			flotte.getCalle().setOr(flotte.getCalle().getOr()-50);
			/* On modifie le bois du port*/
			getDonn�esPort().setSteel(getDonn�esPort().getSteel()-100);
		}
		return flotte;
	}
	
}
