package GuiPort;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAlli�;
import Port.PortEnnemi;
import Donn�esPort.Villes;
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
	private static Chronometre chronoRome;
	private static Chronometre chronoPerse;
	private static Chronometre chronoSparte;
	private static Chronometre chronoLeCaire;
	
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static Flotte flotteRome= new Flotte(2000);
	
	private static PortAlli� Athenes =new PortAlli�(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	private static PortEnnemi Athenes0=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
	
	private static PortAlli� LeCaire =new PortAlli�(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	private static PortEnnemi LeCaire1=new PortEnnemi(Villes.LeCaire,Villes.valeurDeLaVilleLeCaire,Villes.goldLeCaire,Villes.woodLeCaire,Villes.steelLeCaire,Villes.foodLeCaire,Villes.levelLeCaire,flotte,navireATT, navireTransport);
	
	private static PortAlli� Rome =new PortAlli�(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotte,navireATT, navireTransport);
	private static PortEnnemi Rome2=new PortEnnemi(Villes.Rome,Villes.valeurDeLaVilleRome,Villes.goldRome,Villes.woodRome,Villes.steelRome,Villes.foodRome,Villes.levelRome,flotteRome,navireATT, navireTransport);
	
	private static PortAlli� Perse =new PortAlli�(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	private static PortEnnemi Perse3=new PortEnnemi(Villes.Perse,Villes.valeurDeLaVillePerse,Villes.goldPerse,Villes.woodPerse,Villes.steelPerse,Villes.foodPerse,Villes.levelPerse,flotte,navireATT, navireTransport);
	
	private static PortAlli� Sparte =new PortAlli�(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	private static PortEnnemi Sparte4=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleSparte,Villes.goldSparte,Villes.woodSparte,Villes.steelSparte,Villes.foodSparte,Villes.levelSparte,flotte,navireATT, navireTransport);
	
	private static  Moteur moteur;
	
	public static void main(String[] args) {
		flotte.getCalle().setCapacit�Totale(100000);
		flotte.getCalle().setOr(60000);
		moteur= new Moteur();
		moteur.Athenes();
	}
	
	public Moteur() {
		appartenanceAthenes=1;
		this.chronoAthenes= new Chronometre(Athenes,1,(2000/getAthenes().getDonn�esPort().getLevel()));
		this.chronoRome= new Chronometre(Rome,1,(3000/getRome().getDonn�esPort().getLevel()));
		this.chronoSparte= new Chronometre(Sparte,1,(5000/getSparte().getDonn�esPort().getLevel()));
		this.chronoLeCaire= new Chronometre(LeCaire,1,(2000/getLeCaire().getDonn�esPort().getLevel()));
		this.chronoPerse= new Chronometre(Perse,1,(2000/getPerse().getDonn�esPort().getLevel()));
	}
	
	public Moteur(int appartenance, int enCours, PortAlli� portAlli�, PortEnnemi portEnnemi, int selection) {
		if(selection ==0) {
			if(appartenance == 0) {
				Athenes0=portEnnemi;
			}
			if(appartenance==1) {
				Athenes=portAlli�;
			}
		}

	}
	
	public void setChronoAthenes(PortAlli� portAllie ) {
		this.chronoAthenes=new Chronometre(portAllie, 1,(2000/getAthenes().getDonn�esPort().getLevel()));
		moteur.setDonn�esAthenes(chronoAthenes);
	}
	
	public void setChronoRome(PortAlli� portAllie ) {
		this.chronoRome=new Chronometre(portAllie, 1,(3000/getRome().getDonn�esPort().getLevel()));
		moteur.setDonn�esRome(chronoRome);
	}
	
	public void setChronoPerse(PortAlli� portAllie ) {
		this.chronoPerse=new Chronometre(portAllie, 1,(2000/getPerse().getDonn�esPort().getLevel()));
		moteur.setDonn�esPerse(chronoPerse);
	}
	
	public void setChronoLeCaire(PortAlli� portAllie ) {
		this.chronoLeCaire=new Chronometre(portAllie, 1,(2000/getLeCaire().getDonn�esPort().getLevel()));
		moteur.setDonn�esLeCaire(chronoLeCaire);
	}
	
	public void setChronoSparte(PortAlli� portAllie ) {
		this.chronoSparte=new Chronometre(portAllie, 1,(5000/getSparte().getDonn�esPort().getLevel()));
		moteur.setDonn�esSparte(chronoSparte);
	}
	
	public void Athenes() {
		enCours=0;
		moteur.setDonn�esAthenes(chronoAthenes);
		moteur.setDonn�esRome(chronoRome);
		moteur.setDonn�esSparte(chronoSparte);
		moteur.setDonn�esLeCaire(chronoLeCaire);
		moteur.setDonn�esPerse(chronoPerse);
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
		enCours=0;
		moteur.setDonn�esAthenes(chronoAthenes);
		moteur.setDonn�esRome(chronoRome);
		moteur.setDonn�esSparte(chronoSparte);
		moteur.setDonn�esLeCaire(chronoLeCaire);
		moteur.setDonn�esPerse(chronoPerse);
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
		enCours=0;
		moteur.setDonn�esAthenes(chronoAthenes);
		moteur.setDonn�esRome(chronoRome);
		moteur.setDonn�esSparte(chronoSparte);
		moteur.setDonn�esLeCaire(chronoLeCaire);
		moteur.setDonn�esPerse(chronoPerse);
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
		enCours=0;
		moteur.setDonn�esAthenes(chronoAthenes);
		moteur.setDonn�esRome(chronoRome);
		moteur.setDonn�esSparte(chronoSparte);
		moteur.setDonn�esLeCaire(chronoLeCaire);
		moteur.setDonn�esPerse(chronoPerse);
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
		enCours=0;
		moteur.setDonn�esAthenes(chronoAthenes);
		moteur.setDonn�esRome(chronoRome);
		moteur.setDonn�esSparte(chronoSparte);
		moteur.setDonn�esLeCaire(chronoLeCaire);
		moteur.setDonn�esPerse(chronoPerse);
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
	
	//valeur pour savoir si une fenetre est ouverte
	public int getEnCours() {
		return enCours;
	}
	
	public void setEnCours(int enCours) {
		this.enCours=enCours;
	}
	
	//methode de modification du port d'athenes
	public PortAlli� getAthenes() {
		return this.Athenes;
	}
	
	public void setAthenes(PortAlli� Athenes) {
		this.Athenes=Athenes;
	}
	
	public void setDonn�esAthenes(Chronometre chrono) {
		Athenes.getDonn�esPort().setGold(chrono.getGold());
		Athenes.getDonn�esPort().setWood(chrono.getWood());
		Athenes.getDonn�esPort().setFood(chrono.getFood());
		Athenes.getDonn�esPort().setSteel(chrono.getSteel());
		Athenes.setFlotte(flotte);
	}
	
	public PortEnnemi getAthenesEnnemi() {
		return this.Athenes0;
	}
	
	public void setAthenes(PortEnnemi Athenes) {
		this.Athenes0=Athenes;
	}
	
	//methode de modification du port de Perse
	public PortAlli� getPerse() {
		return this.Perse;
	}
	
	public void setPerse(PortAlli� Perse) {
		this.Perse=Perse;
	}
	
	public void setDonn�esPerse(Chronometre chrono) {
		Perse.getDonn�esPort().setGold(chrono.getGold());
		Perse.getDonn�esPort().setWood(chrono.getWood());
		Perse.getDonn�esPort().setFood(chrono.getFood());
		Perse.getDonn�esPort().setSteel(chrono.getSteel());
		Perse.setFlotte(flotte);
	}
	
	public PortEnnemi getPerseEnnemi() {
		return this.Perse3;
	}
	
	public void setPerse(PortEnnemi Perse) {
		this.Perse3=Perse;
	}
	
	//methode de modification du port du Caire
	public PortAlli� getLeCaire() {
		return this.LeCaire;
	}
	
	public void setLeCaire(PortAlli� LeCaire) {
		this.LeCaire=LeCaire;
	}
	
	public void setDonn�esLeCaire(Chronometre chrono) {
		LeCaire.getDonn�esPort().setGold(chrono.getGold());
		LeCaire.getDonn�esPort().setWood(chrono.getWood());
		LeCaire.getDonn�esPort().setFood(chrono.getFood());
		LeCaire.getDonn�esPort().setSteel(chrono.getSteel());
		LeCaire.setFlotte(flotte);
	}
	
	public PortEnnemi getLeCaireEnnemi() {
		return this.LeCaire1;
	}
	
	public void setLeCaire(PortEnnemi LeCaire) {
		this.LeCaire1=LeCaire;
	}
	
	//methode de modification du port de Rome
	public PortAlli� getRome() {
		return this.Rome;
	}
	
	public void setRome(PortAlli� Rome) {
		this.Rome=Rome;
	}
	
	public void setDonn�esRome(Chronometre chrono) {
		Rome.getDonn�esPort().setGold(chrono.getGold());
		Rome.getDonn�esPort().setWood(chrono.getWood());
		Rome.getDonn�esPort().setFood(chrono.getFood());
		Rome.getDonn�esPort().setSteel(chrono.getSteel());
		Rome.setFlotte(flotte);
	}
	
	public PortEnnemi getRomeEnnemi() {
		return this.Rome2;
	}
	
	public void setRome(PortEnnemi Rome) {
		this.Rome2=Rome;
	}
	
	//methode de modification du port de Sparte
	public PortAlli� getSparte() {
		return this.Sparte;
	}
	
	public void setSparte(PortAlli� Sparte) {
		this.Sparte=Sparte;
	}
	
	public void setDonn�esSparte(Chronometre chrono) {
		Sparte.getDonn�esPort().setGold(chrono.getGold());
		Sparte.getDonn�esPort().setWood(chrono.getWood());
		Sparte.getDonn�esPort().setFood(chrono.getFood());
		Sparte.getDonn�esPort().setSteel(chrono.getSteel());
		Sparte.setFlotte(flotte);
	}
	
	public PortEnnemi getSparteEnnemi() {
		return this.Sparte4;
	}
	
	public void setSparte(PortEnnemi Sparte) {
		this.Sparte4=Sparte;
	}
	
	public Flotte getFlotte() {
		return flotte;
	}
	
	public void setFlotteAlli�(Flotte flotte) {
		Sparte.setFlotte(flotte);
		Rome.setFlotte(flotte);
		Athenes.setFlotte(flotte);
		Perse.setFlotte(flotte);
		LeCaire.setFlotte(flotte);
	}
	
}

