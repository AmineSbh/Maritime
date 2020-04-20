package Donn�esPort;

import Donnees_Const_Navire.Calle;

public class Flotte {

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	private int NavireAttaque;
	private int NavireTransport;
	private Calle calle;
	
	public Flotte()
	{
		this.attaque=0;
		this.sante=0;
		this.capacit�=0;
		this.consommation=0;
		this.NavireAttaque=0;
		this.NavireTransport=0;
		this.calle=new Calle(capacit�);
	}
	
	public Flotte(int i)
	{
		this.attaque=i;
		this.sante=i;
		this.capacit�=0;
		this.consommation=0;
		this.NavireAttaque=0;
		this.NavireTransport=0;
		this.calle=new Calle(capacit�);
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacit�+"\n"+consommation;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public void setCapacit�(int capacit�) {
		this.capacit� = capacit�;
		calle.setCapacit�Totale(capacit�);
	}

	public int getConsommation() {
		return consommation;
	}

	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}

	public int getNavireAttaque() {
		return NavireAttaque;
	}

	public void setNavireAttaque(int navireAttaque) {
		NavireAttaque = navireAttaque;
	}

	public int getNavireTransport() {
		return NavireTransport;
	}

	public void setNavireTransport(int navireTransport) {
		NavireTransport = navireTransport;
	}

	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}
}
