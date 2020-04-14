package GuiPort;

import java.awt.EventQueue;

import javax.swing.JFrame;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAllié;
import Port.PortEnnemi;
import DonnéesPort.Villes;

public class Perse extends JFrame {
	
	private static NavireAttaque navireATT=new NavireAttaque(1);
	private static int appartenance=0;
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static PortAllié Athenes =new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	private static PortEnnemi Athenes1=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	public static void main(String[] args) {
		if(appartenance==1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortAllie frame = new PortAllie(Athenes);
					frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
						}
				}
			});
		}
		else {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortEnnemiGui frame = new PortEnnemiGui(Athenes1,flotte);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}
	}
	
}