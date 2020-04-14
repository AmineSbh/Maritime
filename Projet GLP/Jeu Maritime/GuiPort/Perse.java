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
	private static int appartenance=1;
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	
	private static PortAllié Athenes =new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	private static PortEnnemi Athenes1=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	
	private static PortAllié LeCaire =new PortAllié(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	private static PortEnnemi LeCaire1=new PortEnnemi(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	
	private static PortAllié Rome =new PortAllié(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotte,navireATT, navireTransport);
	private static PortEnnemi Rome1=new PortEnnemi(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotte,navireATT, navireTransport);
	
	private static PortAllié Perse =new PortAllié(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	private static PortEnnemi Perse1=new PortEnnemi(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	
	private static PortAllié Sparte =new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	private static PortEnnemi Sparte1=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	public static void main(String[] args) {
		Rome();
	}
	
	public static void Athenes() {
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
			flotte=Athenes.getFlotte();
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
			flotte=Athenes.getFlotte();
			}
	}
	
	public static void Rome() {
		if(appartenance==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Rome);
						frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
							}
					}
				});
			flotte=Rome.getFlotte();
			}
			else {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortEnnemiGui frame = new PortEnnemiGui(Rome1,flotte);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			flotte=Rome.getFlotte();
			}
	}
	
	public static void LeCaire() {
		if(appartenance==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(LeCaire);
						frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
							}
					}
				});
			flotte=LeCaire.getFlotte();
			}
			else {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortEnnemiGui frame = new PortEnnemiGui(LeCaire1,flotte);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			flotte=LeCaire.getFlotte();
			}
	}
	
	public static void Sparte() {
		if(appartenance==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Sparte);
						frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
							}
					}
				});
			flotte=Sparte.getFlotte();
			}
			else {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortEnnemiGui frame = new PortEnnemiGui(Sparte1,flotte);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			flotte=Sparte.getFlotte();
			}
	}
	
	public static void Perse() {
		if(appartenance==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Perse);
						frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
							}
					}
				});
			flotte=Perse.getFlotte();
			}
			else {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortEnnemiGui frame = new PortEnnemiGui(Perse1,flotte);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			flotte=Perse.getFlotte();
			}
	}
	
	
	
}