package Port;

import Navire.Flotte;

public class PortAllié extends Port{

	private Flotte flotte;
	
	public PortAllié(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level)
	{
		super(name,valeurDeLaVille, gold, wood, steel, food, level);
		flotte = new Flotte();
		
	}
	
	public void Amélioration()
	{
		
	}
	
	public void ConstructionFlotte()
	{
		
	}

	public Flotte getFlotte() {
		return flotte;
	}
}
