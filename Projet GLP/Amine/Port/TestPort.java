package Port;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;

public class TestPort {

	public static void main(String[] args) {
		Flotte flotte= new Flotte();
		NavireAttaque navireA = new NavireAttaque();
		NavireTransport navireB = new NavireTransport();
		
		PortAlli� port= new PortAlli�("Perse",20000,3000000,50000,7000,2000,4,flotte,navireA, navireB);
		
		System.out.println(flotte.getConsommation());
		port.AjouterAttaquePort();
		System.out.println(navireA.getConsommation());
		System.out.println(port.getFlotte().getConsommation());
	}

}
