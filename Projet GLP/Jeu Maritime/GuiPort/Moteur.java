package GuiPort;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAllié;
import Port.PortEnnemi;
import DonnéesPort.Villes;
import Moteur.Chronometre;

public class Moteur extends JFrame {
	
	private static NavireAttaque navireATT=new NavireAttaque(1);
	
	private static int enCours=1;
	
	private static int appartenanceAthenes=0;
	private static int appartenanceLeCaire=0;
	private static int appartenanceRome=0;
	private static int appartenanceSparte=0;
	private static int appartenancePerse=0;
	
	private static Chronometre chronoAthenes;
	
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	
	private static PortAllié Athenes =new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	private static PortEnnemi Athenes0=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	
	private static PortAllié LeCaire =new PortAllié(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	private static PortEnnemi LeCaire1=new PortEnnemi(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	
	private static PortAllié Rome =new PortAllié(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotte,navireATT, navireTransport);
	private static PortEnnemi Rome2=new PortEnnemi(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotte,navireATT, navireTransport);
	
	private static PortAllié Perse =new PortAllié(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	private static PortEnnemi Perse3=new PortEnnemi(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	
	private static PortAllié Sparte =new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	private static PortEnnemi Sparte4=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	
	private static  Moteur moteur;
	
	public static void main(String[] args) {
		moteur= new Moteur();
		//moteur.Chrono1(Athenes);
		moteur.Athenes();
		//moteur.Rome();
		//Rome();
	}
	
	public Moteur() {
		appartenanceAthenes=0;
		this.chronoAthenes= new Chronometre(Athenes,1);
	}
	
	public Moteur(int appartenance, int enCours, PortAllié portAllié, PortEnnemi portEnnemi, int selection) {
		if(selection ==0) {
			if(appartenance == 0) {
				Athenes0=portEnnemi;
			}
			if(appartenance==1) {
				Athenes=portAllié;
			}
		}

	}
	
	public void setChrono(PortAllié portAllie ) {
		Chronometre chrono=new Chronometre(portAllie, 1);
		this.chronoAthenes=chrono;
		Athenes.getDonnéesPort().setGold(chronoAthenes.getGold());
		//int goldAthenes=chronoAthenes.getGold();
		System.out.println("hgikugol"+chrono.getGold());
	}
	
	public static void Athenes() {
		moteur.setEnCours(0);
		Athenes.getDonnéesPort().setGold(chronoAthenes.getGold());
		if(appartenanceAthenes==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Athenes,moteur);
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
						PortEnnemiGui frame = new PortEnnemiGui(Athenes0,flotte,moteur);
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
		moteur.setEnCours(0);
		if(appartenanceRome==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Rome,moteur);
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
						PortEnnemiGui frame = new PortEnnemiGui(Rome2,flotte,moteur);
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
		moteur.setEnCours(0);
		if(appartenanceLeCaire==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(LeCaire,moteur);
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
						PortEnnemiGui frame = new PortEnnemiGui(LeCaire1,flotte,moteur);
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
		moteur.setEnCours(0);
		if(appartenanceSparte==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Sparte,moteur);
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
						PortEnnemiGui frame = new PortEnnemiGui(Sparte4,flotte,moteur);
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
		moteur.setEnCours(0);
		if(appartenancePerse==1) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortAllie frame = new PortAllie(Perse,moteur);
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
						PortEnnemiGui frame = new PortEnnemiGui(Perse3,flotte,moteur);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			flotte=Perse.getFlotte();
			}
	}
	
	public void Chrono1(PortAllié portallie) {
		if(enCours==1) {
	    Timer chrono = new Timer();
	    chrono.schedule(new TimerTask(){
	        /*int gold=or;
	        int wood=bois;
	        int steel=acier;
	        int food=nourriture;*/

	        public void run() {
	            System.out.println(portallie.getDonnéesPort().getGold());
	            portallie.getDonnéesPort().setGold(portallie.getDonnéesPort().getGold()+8);
	            
	            System.out.println(portallie.getDonnéesPort().getWood());
	            portallie.getDonnéesPort().setWood(portallie.getDonnéesPort().getWood()+8);
	            
	            System.out.println(portallie.getDonnéesPort().getSteel());
	            portallie.getDonnéesPort().setSteel(portallie.getDonnéesPort().getSteel()+8);
	            
	            System.out.println(portallie.getDonnéesPort().getFood());
	            portallie.getDonnéesPort().setFood(portallie.getDonnéesPort().getFood()+8);
	            //System.out.println(wood);
	            //wood++;
	            //System.out.println(steel);
	            //steel++;
	            //System.out.println(food);
	            //food++;
	        }

	    },1000,1000);
		}else {
			
		}
	}
	
	public int getAppartenanceAthenes() {
		return appartenanceAthenes;
	}
	
	public void setAppartenanceAthenes(int appartenance) {
		this.appartenanceAthenes=appartenance;
	}
	
	public int getAppartenanceRome() {
		return appartenanceAthenes;
	}
	
	public void setAppartenanceRome(int appartenance) {
		this.appartenanceRome=appartenance;
	}
	
	public int getAppartenanceSparte() {
		return appartenanceSparte;
	}
	
	public void setAppartenanceSparte(int appartenance) {
		this.appartenanceSparte=appartenance;
	}
	
	public int getAppartenanceLeCaire() {
		return appartenanceLeCaire;
	}
	
	public void setAppartenanceLeCaire(int appartenance) {
		this.appartenanceLeCaire=appartenance;
	}
	
	public int getAppartenancePerse() {
		return appartenancePerse;
	}
	
	public void setAppartenancePerse(int appartenance) {
		this.appartenancePerse=appartenance;
	}
	
	public int getEnCours() {
		return enCours;
	}
	
	public void setEnCours(int enCours) {
		this.enCours=enCours;
	}
	
	public PortAllié getAthenes() {
		return this.Athenes;
	}
	
	public void setAthenes(PortAllié Athenes) {
		this.Athenes=Athenes;
	}
	
	public PortEnnemi getAthenesEnnemi() {
		return this.Athenes0;
	}
	
	public void setAthenes(PortEnnemi Athenes) {
		this.Athenes0=Athenes;
	}
	
}
