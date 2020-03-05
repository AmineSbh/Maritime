package Port;

import DonnéesPort.DonneePort;
import Navire.Flotte;

public abstract class Port {
	
	private DonneePort donnéesPort;
	
	public Port(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level)
	{
		donnéesPort = new DonneePort(name,valeurDeLaVille, gold, wood, steel, food, level);
	}
	
	public void Marche() {
		
	}
	
	public void Negociation() {
		
	}

	public DonneePort getDonnéesPort() {
		return donnéesPort;
	}
	
	

}
