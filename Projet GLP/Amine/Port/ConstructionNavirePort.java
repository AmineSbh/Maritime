package Port;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class ConstructionNavirePort {
	
	private NavireAttaque navireATT;
	private NavireTransport navireTransport;
	private Flotte flotte;
	
	public ConstructionNavirePort(NavireAttaque navireATT,NavireTransport navireTransport,Flotte flotte)
	{
		this.navireATT=navireATT;
		this.navireTransport=navireTransport;
		this.flotte=flotte;
	}
	
	public Flotte AjouterNavireAttaque(NavireAttaque navireAttaque){
		flotte.setAttaque(flotte.getAttaque()+navireAttaque.getAttaque());
		flotte.setSante(flotte.getSante()+navireAttaque.getSante());
		flotte.setCapacit�(flotte.getCapacit�()+navireAttaque.getCapacit�());
		flotte.setConsommation(flotte.getConsommation()+navireAttaque.getConsommation());
		
		return flotte;
	}
	
	public Flotte AjouterNavireTransport(NavireTransport navireTransport){
		flotte.setAttaque(flotte.getAttaque()+navireTransport.getAttaque());
		flotte.setSante(flotte.getSante()+navireTransport.getSante());
		flotte.setCapacit�(flotte.getCapacit�()+navireTransport.getCapacit�());
		flotte.setConsommation(flotte.getConsommation()+navireTransport.getConsommation());
		
		return flotte;
	}

	public NavireAttaque getNavireATT() {
		return navireATT;
	}

	public NavireTransport getNavireTransport() {
		return navireTransport;
	}

}
