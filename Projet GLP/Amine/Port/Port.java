package Port;

import Donn�esPort.DonneePort;
import Navire.Flotte;

public abstract class Port {
	
	private DonneePort donn�esPort;
	
	public Port(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level)
	{
		donn�esPort = new DonneePort(name,valeurDeLaVille, gold, wood, steel, food, level);
	}
	
	public void Marche() {
		
	}
	
	public void Negociation() {
		
	}

	public DonneePort getDonn�esPort() {
		return donn�esPort;
	}
	
	

}
