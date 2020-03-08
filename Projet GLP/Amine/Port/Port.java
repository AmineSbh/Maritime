package Port;

import Donn�esPort.DonneePort;
import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public abstract class Port {
	
	private DonneePort donn�esPort;
	private Flotte flotte;
	private NavireAttaque navireATT;
	private NavireTransport navireTransport;
	
	public Port(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level,Flotte flotte,NavireAttaque navireAttaque, NavireTransport navireTransport)
	{
		this.flotte=flotte;
		donn�esPort = new DonneePort(name,valeurDeLaVille, gold, wood, steel, food, level);
		this.navireATT= navireAttaque;
		this.navireTransport= navireTransport;
	}
	
	public void Marche() {
		
	}
	
	public void Negociation() {
		
	}

	public DonneePort getDonn�esPort() {
		return donn�esPort;
	}
	
	public Flotte getFlotte() {
		return flotte;
	}
	
	public void setFlotte(Flotte flotte) {
		this.flotte=flotte;
	}

	public NavireAttaque getNavireATT() {
		return navireATT;
	}

	public void setNavireATT(NavireAttaque navireATT) {
		this.navireATT = navireATT;
	}

	public NavireTransport getNavireTransport() {
		return navireTransport;
	}

	public void setNavireTransport(NavireTransport navireTransport) {
		this.navireTransport = navireTransport;
	}

}
